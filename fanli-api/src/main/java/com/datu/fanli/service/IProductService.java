package com.datu.fanli.service;

import com.datu.fanli.bean.BaseSaleAttr;
import com.datu.fanli.bean.ProductImage;
import com.datu.fanli.bean.ProductInfo;
import com.datu.fanli.bean.ProductSaleAttr;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/14
 */
public interface IProductService {
    /**
     * 根据catalog3Id获取产品列表
     * @param catalog3Id 第三级分类Id
     * @return 产品信息列表
     */
    List<ProductInfo> getProductList(String catalog3Id);

    /**
     * 根据id获取ProductInfo
     * @param productInfoId 产品Id
     * @return ProductInfo实体类, 以及相应的<strong>图片, 产品属性 和 产品属性值</strong>
     */
    ProductInfo getProductInfoById(String productInfoId);

    /**
     * 级联保存或更新产品信息
     * @param productInfo 产品信息实体类
     */
    void saveProductInfo(ProductInfo productInfo);

    /**
     * 删除产品信息
     * @param productInfoId 产品信息Id
     */
    void deleteProductInfo(String productInfoId);

    /**
     * 级联保存或更新产品信息
     * @param productSaleAttr 产品销售属性实体类
     */
    void saveProductSaleAttr(ProductSaleAttr productSaleAttr);

    /**
     * 删除产品销售属性
     * @param productSaleAttrId 产品销售属性Id
     */
    void deleteProductSaleAttr(String productSaleAttrId);

    /**
     * 获取基本销售属性列表
     * @param catalog3Id
     * @return 基本销售属性列表
     */
    List<BaseSaleAttr> getBaseSaleAttrList(String catalog3Id);

    /**
     * 获取产品销售属性列表
     * @param productInfoId  产品信息Id
     * @return 产品销售属性列表
     */
    List<ProductSaleAttr> getProductSaleAttrList(String productInfoId);

    /**
     * 获取产品图片信息列表
     * @param productInfoId 产品信息Id
     * @return 产品图片信息列表
     */
    List<ProductImage> getProductImageList(String productInfoId);

    void saveProductImage(String name, String url);
}
