package com.datu.fanli.manage.service.impl;

import com.datu.fanli.bean.*;
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
        SkuInfoExample example = new SkuInfoExample();
        example.createCriteria().andProductIdEqualTo(productInfoId);
        return skuInfoMapper.selectByExample(example);
    }

    @Override
    public SkuInfo getSkuInfoById(String skuId) {
        SkuInfo skuInfo = skuInfoMapper.selectByPrimaryKey(skuId);

        SkuSaleAttrValueExample skuSaleAttrValueExample = new SkuSaleAttrValueExample();
        skuSaleAttrValueExample.createCriteria().andSkuIdEqualTo(skuId);
        skuInfo.setSkuSaleAttrValueList(skuSaleAttrValueMapper.selectByExample(skuSaleAttrValueExample));

        SkuAttrValueExample skuAttrValueExample = new SkuAttrValueExample();
        skuAttrValueExample.createCriteria().andSkuIdEqualTo(skuId);
        skuInfo.setSkuAttrValueList(skuAttrValueMapper.selectByExample(skuAttrValueExample));
        return skuInfo;
    }

    @Override
    public String saveSkuInfo(SkuInfo skuInfo) {
        if (skuInfo.getId() != null) {
            // 更新
            skuInfoMapper.updateByPrimaryKey(skuInfo);
            skuInfo.getSkuAttrValueList().stream().spliterator().forEachRemaining(
                    skuAttrValue -> {
                        skuAttrValueMapper.updateByPrimaryKey(skuAttrValue);
                    }
            );
            skuInfo.getSkuSaleAttrValueList().stream().spliterator().forEachRemaining(
                    skuSaleAttrValue -> {
                        skuSaleAttrValueMapper.updateByPrimaryKey(skuSaleAttrValue);
                    }
            );
        } else {
            // 插入
            String skuInfoId = String.valueOf(skuInfoMapper.insert(skuInfo));
            skuInfo.getSkuAttrValueList().stream().spliterator().forEachRemaining(
                    skuAttrValue -> {
                        skuAttrValue.setSkuId(skuInfoId);
                        skuAttrValueMapper.insert(skuAttrValue);
                    }
            );
            skuInfo.getSkuSaleAttrValueList().stream().spliterator().forEachRemaining(
                    skuSaleAttrValue -> {
                        skuSaleAttrValue.setSkuId(skuInfoId);
                        skuSaleAttrValueMapper.insert(skuSaleAttrValue);
                    }
            );
        }
        return "success";
    }

    @Override
    public void deleteSkuInfo(String skuId) {
        SkuSaleAttrValueExample skuSaleAttrValueExample = new SkuSaleAttrValueExample();
        skuSaleAttrValueExample.createCriteria().andSkuIdEqualTo(skuId);
        skuSaleAttrValueMapper.deleteByExample(skuSaleAttrValueExample);

        SkuAttrValueExample skuAttrValueExample = new SkuAttrValueExample();
        skuAttrValueExample.createCriteria().andSkuIdEqualTo(skuId);
        skuAttrValueMapper.deleteByExample(skuAttrValueExample);

        skuInfoMapper.deleteByPrimaryKey(skuId);
    }
}
