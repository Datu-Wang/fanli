package com.datu.fanli.manage.service.impl;

import com.datu.fanli.bean.SkuAttrValue;
import com.datu.fanli.bean.SkuInfo;
import com.datu.fanli.bean.SkuSaleAttrValue;
import com.datu.fanli.manage.dao.SkuAttrValueMapper;
import com.datu.fanli.manage.dao.SkuInfoMapper;
import com.datu.fanli.manage.dao.SkuSaleAttrValueMapper;
import com.datu.fanli.service.ISkuService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/23
 */
@Service
public class SkuServiceImpl implements ISkuService {
    @Resource
    SkuInfoMapper skuInfoMapper;

    @Resource
    SkuAttrValueMapper skuAttrValueMapper;

    @Resource
    SkuSaleAttrValueMapper skuSaleAttrValueMapper;

    @Override
    public List<SkuInfo> getSkuListByProductInfoId(String productInfoId) {
        return null;
    }

    @Override
    public SkuInfo getSkuInfoById(String skuId) {
        return null;
    }
}
