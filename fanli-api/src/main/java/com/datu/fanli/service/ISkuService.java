package com.datu.fanli.service;

import com.datu.fanli.bean.SkuInfo;
import com.datu.fanli.bean.SkuInfoExample;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/23
 */
public interface ISkuService {
    /**
     * 返回对应spu的sku
     * @param productInfoId spu的Id
     * @return 对应sku列表
     */
    List<SkuInfo> getSkuListByProductInfoId(String productInfoId);

    /**
     * 返回SkuInfo以及对应的SkuValueList和SkuSaleValueList
     * @param skuId
     * @return
     */
    SkuInfo getSkuInfoById(String skuId);
}
