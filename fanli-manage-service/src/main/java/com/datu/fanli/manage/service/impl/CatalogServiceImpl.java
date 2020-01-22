package com.datu.fanli.manage.service.impl;

import com.datu.fanli.bean.*;
import com.datu.fanli.manage.dao.*;
import com.datu.fanli.service.ICatalogService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/11
 */
@Service
public class CatalogServiceImpl implements ICatalogService {
    @Resource
    BaseCatalog1Mapper baseCatalog1Mapper;

    @Resource
    BaseCatalog2Mapper baseCatalog2Mapper;

    @Resource
    BaseCatalog3Mapper baseCatalog3Mapper;

    @Resource
    BaseAttrInfoMapper baseAttrInfoMapper;

    @Resource
    BaseAttrValueMapper baseAttrValueMapper;

    @Override
    public List<BaseCatalog1> baseCatalog1s() {
        return baseCatalog1Mapper.selectByExample(null);
    }

    @Override
    public List<BaseCatalog2> baseCatalog2s(Integer catalog1Id) {
        BaseCatalog2Example example = new BaseCatalog2Example();
        example.createCriteria().andCatalog1IdEqualTo(catalog1Id);
        return baseCatalog2Mapper.selectByExample(example);
    }

    @Override
    public List<BaseCatalog3> baseCatalog3s(Integer catalog2Id) {
        BaseCatalog3Example example = new BaseCatalog3Example();
        example.createCriteria().andCatalog2IdEqualTo(catalog2Id);
        return baseCatalog3Mapper.selectByExample(example);
    }

    @Override
    public List<BaseAttrInfo> getBaseAttrInfoByCatalog3Id(String catalog3Id) {
        BaseAttrInfoExample example = new BaseAttrInfoExample();
        example.createCriteria().andCatalog3IdEqualTo(catalog3Id);
        List<BaseAttrInfo> baseAttrInfoList = baseAttrInfoMapper.selectByExample(example);
        baseAttrInfoList.stream().spliterator().forEachRemaining(baseAttrInfo -> {
            BaseAttrValueExample baseAttrValueExample = new BaseAttrValueExample();
            baseAttrValueExample.createCriteria().andAttrIdEqualTo(baseAttrInfo.getId());
            baseAttrInfo.setAttrValueList(baseAttrValueMapper.selectByExample(baseAttrValueExample));
        });
        return baseAttrInfoList;
    }

    @Override
    public List<BaseAttrValue> getAttrValueListByAttrId(String attrId) {
        BaseAttrValueExample example = new BaseAttrValueExample();
        example.createCriteria().andAttrIdEqualTo(attrId);
        return baseAttrValueMapper.selectByExample(example);
    }

    @Override
    public int addAttrInfo(BaseAttrInfo baseAttrInfo) {
        String attrInfoId = String.valueOf(baseAttrInfoMapper.insert(baseAttrInfo));
        // 逐个添加属性值
        addAttrValueInList(baseAttrInfo.getAttrValueList(), attrInfoId);
        return 0;
    }

    /**
     * 将一个列表中的<strong>属性值</strong>添加入库
     * @param baseAttrValues 属性值列表
     */
    private void addAttrValueInList(List<BaseAttrValue> baseAttrValues, String attrInfoId) {
//        baseAttrValues.stream().spliterator().forEachRemaining(baseAttrValueMapper::insert);
        baseAttrValues.stream().spliterator().forEachRemaining(baseAttrValue -> {
            if (baseAttrValue.getId() != null) {
                // 已经有id的情况
                baseAttrValueMapper.insertWithId(baseAttrValue);
            } else {
                // 无id的情况
                baseAttrValue.setAttrId(attrInfoId);
                baseAttrValueMapper.insert(baseAttrValue);
            }
        });
    }

    @Override
    public int deleteAttrInfo(String attrInfoId) {
        baseAttrInfoMapper.deleteByPrimaryKey(attrInfoId);
        deleteAttrValueByAttrInfoId(attrInfoId);
        return 1;
    }

    /**
     * 根据 属性id 删除对应的 属性<strong>值</strong>
     * @param attrInfoId 属性id
     */
    private void deleteAttrValueByAttrInfoId(String attrInfoId) {
        BaseAttrValueExample example = new BaseAttrValueExample();
        example.createCriteria().andAttrIdEqualTo(attrInfoId);
        baseAttrValueMapper.deleteByExample(example);
    }

    @Override
    public int updateAttrInfo(BaseAttrInfo baseAttrInfo) {
        baseAttrInfoMapper.updateByPrimaryKey(baseAttrInfo);
        deleteAttrValueByAttrInfoId(baseAttrInfo.getId());
        addAttrValueInList(baseAttrInfo.getAttrValueList(), baseAttrInfo.getId());
        return 1;
    }

    @Override
    public int changeAttrInfoStatus(String attrInfoId, String isEnabled) {
        baseAttrInfoMapper.changeAttrInfoStatus(attrInfoId, isEnabled);
        return 1;
    }

    @Override
    public int changeAttrValueStatus(String attrValueId, String isEnabled) {
        baseAttrValueMapper.changeAttrValueStatus(attrValueId, isEnabled);
        return 1;
    }
}
