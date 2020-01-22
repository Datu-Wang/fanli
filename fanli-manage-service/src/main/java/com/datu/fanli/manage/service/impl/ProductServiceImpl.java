package com.datu.fanli.manage.service.impl;

import com.datu.fanli.bean.*;
import com.datu.fanli.manage.dao.*;
import com.datu.fanli.service.IProductService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: datu
 * @date: 2020/1/15
 */
@Service
public class ProductServiceImpl implements IProductService {
    private static final String productImage = "C:/Users/81519/Desktop/fanli/fanli-manage-web/src/main/resources/static/pro_image/";

    @Resource
    ProductInfoMapper productInfoMapper;

    @Resource
    BaseSaleAttrMapper baseSaleAttrMapper;

    @Resource
    ProductSaleAttrMapper productSaleAttrMapper;

    @Resource
    ProductSaleAttrValueMapper productSaleAttrValueMapper;

    @Resource
    ProductImageMapper productImageMapper;

    @Override
    public List<ProductInfo> getProductList(String catalog3Id) {
        ProductInfoExample example = new ProductInfoExample();
        example.createCriteria().andCatalog3IdEqualTo(catalog3Id);
        return productInfoMapper.selectByExample(example);
    }

    @Override
    public ProductInfo getProductInfoById(String productInfoId) {
        ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(productInfoId);
        // 获取ProductImage列表, 并设置
        ProductImageExample productImageExample = new ProductImageExample();
        productImageExample.createCriteria().andProductIdEqualTo(productInfoId);
        productInfo.setProductImageList(productImageMapper.selectByExample(productImageExample));
        // 获取ProductSaleAttr列表
        ProductSaleAttrExample productSaleAttrExample = new ProductSaleAttrExample();
        productSaleAttrExample.createCriteria().andProductIdEqualTo(productInfoId);
        List<ProductSaleAttr> productSaleAttrList = productSaleAttrMapper.selectByExample(productSaleAttrExample);
        // 遍历ProductSaleAttr列表, 并获取对应的ProductSaleAttrValue列表
        productSaleAttrList.stream().spliterator().forEachRemaining(productSaleAttr -> {
            ProductSaleAttrValueExample example = new ProductSaleAttrValueExample();
            // 设置对应的product_id, sale_attr_id
            example.createCriteria().andProductIdEqualTo(productInfoId)
                    .andSaleAttrIdEqualTo(productSaleAttr.getSaleAttrId());
            productSaleAttr.setProductSaleAttrValueList(productSaleAttrValueMapper.selectByExample(example));
        });
        // 设置ProductSaleAttr列表
        productInfo.setProductSaleAttrList(productSaleAttrList);
        return productInfo;
    }

    @Override
    public void saveProductInfo(ProductInfo productInfo) {
        if (productInfo.getId() != null) {
            // 更新处理
            processProductImageInList(productInfo.getProductImageList());
            processProductSaleAttrInList(productInfo.getProductSaleAttrList());
            productInfo.getProductSaleAttrList().stream().spliterator().forEachRemaining(productSaleAttr -> {
                processProductSaleAttrValueInList(productSaleAttr.getProductSaleAttrValueList());
            });
            productInfoMapper.updateByPrimaryKey(productInfo);
        } else {
            // 直接插入
            String productInfoId = String.valueOf(productInfoMapper.insert(productInfo));
            productInfo.getProductImageList().stream().spliterator().forEachRemaining(productImage -> {
                productImage.setProductId(productInfoId);
                productImageMapper.insert(productImage);
            });
            productInfo.getProductSaleAttrList().stream().spliterator().forEachRemaining(productSaleAttr -> {
                productSaleAttr.setProductId(productInfoId);
                productSaleAttrMapper.insert(productSaleAttr);
                productSaleAttr.getProductSaleAttrValueList().stream().spliterator()
                        .forEachRemaining(productSaleAttrValue -> {
                            productSaleAttrValue.setProductId(productInfoId);
                            productSaleAttrValueMapper.insert(productSaleAttrValue);
                        });
            });
        }
    }

    @Override
    public void deleteProductInfo(String productInfoId) {
        productInfoMapper.deleteByPrimaryKey(productInfoId);
    }

    @Override
    public void saveProductSaleAttr(ProductSaleAttr productSaleAttr) {
        if (productSaleAttr.getId() != null) {
            productSaleAttrMapper.updateByPrimaryKey(productSaleAttr);
            processProductSaleAttrValueInList(productSaleAttr.getProductSaleAttrValueList());
        } else {
            productSaleAttrMapper.insert(productSaleAttr);
            productSaleAttr.getProductSaleAttrValueList().stream().spliterator().forEachRemaining(productSaleAttrValue -> {
                productSaleAttrValueMapper.insert(productSaleAttrValue);
            });
        }
    }

    @Override
    public void deleteProductSaleAttr(String productSaleAttrId) {
        productSaleAttrMapper.deleteByPrimaryKey(productSaleAttrId);
    }

    private void processProductSaleAttrInList(List<ProductSaleAttr> productSaleAttrList) {
        productSaleAttrList.stream().spliterator().forEachRemaining(productSaleAttr -> {
            if (productSaleAttr.getProcessTag() != null) {
                switch (productSaleAttr.getProcessTag()) {
                    case ProductSaleAttr.TO_ADD:
                        productSaleAttrMapper.insert(productSaleAttr);
                        break;
                    case ProductSaleAttr.TO_DELETE:
                        productSaleAttrMapper.deleteByPrimaryKey(productSaleAttr.getId());
                        break;
                    default:
                        break;
                }
            }
        });
    }

    /**
     * 根据processTag处理ProductImage
     * @param productImageList 产品图片列表
     */
    private void processProductImageInList(List<ProductImage> productImageList) {
        productImageList.stream().spliterator().forEachRemaining(productImage -> {
            if (productImage.getProcessTag() != null) {
                switch (productImage.getProcessTag()) {
                    case ProductImage.TO_ADD:
                        productImageMapper.insert(productImage);
                        break;
                    case ProductImage.TO_DELETE:
                        // 删除文件
                        deleteFile(productImage.getImgName());
                        productImageMapper.deleteByPrimaryKey(productImage.getId());
                        break;
                    default:
                        break;
                }
            }
        });
    }

    /**
     * 删除文件
     * @param filename 文件名
     */
    private void deleteFile(String filename) {
        String path = productImage + filename;
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
    }

    private void processProductSaleAttrValueInList(List<ProductSaleAttrValue> productSaleAttrValueList) {
        productSaleAttrValueList.stream().spliterator().forEachRemaining(productSaleAttrValue -> {
            if (productSaleAttrValue.getProcessTag() != null) {
                switch (productSaleAttrValue.getProcessTag()) {
                    case ProductSaleAttrValue.TO_ADD:
                        productSaleAttrValueMapper.insert(productSaleAttrValue);
                        break;
                    case ProductSaleAttrValue.TO_DELETE:
                        productSaleAttrValueMapper.deleteByPrimaryKey(productSaleAttrValue.getId());
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public List<BaseSaleAttr> getBaseSaleAttrList(String catalog3Id) {
        BaseSaleAttrExample example = new BaseSaleAttrExample();
        example.createCriteria().andCatalog3IdEqualTo(catalog3Id);
        return baseSaleAttrMapper.selectByExample(example);
    }

    @Override
    public List<ProductSaleAttr> getProductSaleAttrList(String productInfoId) {
        ProductSaleAttrExample example = new ProductSaleAttrExample();
        example.createCriteria().andProductIdEqualTo(productInfoId);
        return productSaleAttrMapper.selectByExample(example);
    }

    @Override
    public List<ProductImage> getProductImageList(String productInfoId) {
        ProductImageExample example = new ProductImageExample();
        example.createCriteria().andProductIdEqualTo(productInfoId);
        return productImageMapper.selectByExample(example);
    }

    @Override
    public void saveProductImage(String name, String url) {
        ProductImage image = new ProductImage();
        image.setImgName(name);
        image.setImgUrl(url);
        image.setProductId("24");
        productImageMapper.insert(image);
    }


}
