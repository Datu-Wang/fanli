package com.datu.fanli.service;

import com.datu.fanli.bean.ProductInfo;
import com.datu.fanli.bean.ProductSaleAttr;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/14
 */
public interface IProductService {
    List<ProductInfo> getProductList();

    int saveProductInfo(ProductInfo productInfo);

    List<ProductSaleAttr> getBaseSaleAttrList();
}
