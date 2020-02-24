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

    /**
     * 更新或者插入一个skuInfo实体,以及对应的SkuValueList和SkuSaleValueList
     * @param skuInfo skuInfo实体
     * @return "success"
     */
    String saveSkuInfo(SkuInfo skuInfo);

    /**
     * 删除skuInfo实体以及相关信息
     * @param skuId id
     */
    void deleteSkuInfo(String skuId);
}
