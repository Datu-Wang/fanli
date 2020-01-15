package com.datu.fanli.manage.service.impl;

import com.datu.fanli.bean.*;
import com.datu.fanli.manage.dao.*;
import com.datu.fanli.service.IProductService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/15
 */
@Service
public class ProductServiceImpl implements IProductService {
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
    public void saveProductInfo(ProductInfo productInfo) {
        if (productInfo.getId() != null) {
            // 更新处理
            processProductImageInList(productInfo.getProductImageList());
            processProductSaleAttrInList(productInfo.getProductSaleAttrList());
            productInfoMapper.updateByPrimaryKey(productInfo);
        } else {
            // 直接插入
            productInfoMapper.insert(productInfo);
            productInfo.getProductImageList().stream().spliterator().forEachRemaining(productImage -> {
                productImageMapper.insert(productImage);
            });
            productInfo.getProductSaleAttrList().stream().spliterator().forEachRemaining(productSaleAttr -> {
                productSaleAttrMapper.insert(productSaleAttr);
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
            switch (productSaleAttr.getProcessTag()) {
                case ProductSaleAttr.TO_ADD:
                    productSaleAttrMapper.insert(productSaleAttr);
                    break;
                case ProductSaleAttr.TO_UPDATE:
                    productSaleAttrMapper.updateByPrimaryKey(productSaleAttr);
                    break;
                case ProductSaleAttr.TO_DELETE:
                    productSaleAttrMapper.deleteByPrimaryKey(productSaleAttr.getId());
                    break;
                default:
                    break;
            }
        });
    }

    private void processProductImageInList(List<ProductImage> productImageList) {
        productImageList.stream().spliterator().forEachRemaining(productImage -> {
            switch (productImage.getProcessTag()) {
                case ProductImage.TO_ADD:
                    productImageMapper.insert(productImage);
                    break;
                case ProductImage.TO_UPDATE:
                    productImageMapper.updateByPrimaryKey(productImage);
                    break;
                case ProductImage.TO_DELETE:
                    productImageMapper.deleteByPrimaryKey(productImage.getId());
                    break;
                default:
                    break;
            }
        });
    }

    private void processProductSaleAttrValueInList(List<ProductSaleAttrValue> productSaleAttrValueList) {
        productSaleAttrValueList.stream().spliterator().forEachRemaining(productSaleAttrValue -> {
            switch (productSaleAttrValue.getProcessTag()) {
                case ProductSaleAttrValue.TO_ADD:
                    productSaleAttrValueMapper.insert(productSaleAttrValue);
                    break;
                case ProductSaleAttrValue.TO_UPDATE:
                    productSaleAttrValueMapper.updateByPrimaryKey(productSaleAttrValue);
                    break;
                case ProductSaleAttrValue.TO_DELETE:
                    productSaleAttrValueMapper.deleteByPrimaryKey(productSaleAttrValue.getId());
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    public List<BaseSaleAttr> getBaseSaleAttrList() {
        return baseSaleAttrMapper.selectByExample(null);
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
}
