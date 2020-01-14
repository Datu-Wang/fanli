package com.datu.fanli.service;

import com.datu.fanli.bean.*;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/11
 */
public interface ICatalogService {
    /**
     * 返回一级分类信息
     * @return List<BaseCatalog1>
     */
    List<BaseCatalog1> baseCatalog1s();

    /**
     * 根据一级分类信息,返回二级分类信息
     * @param catalog1Id 一级分类ID
     * @return List<BaseCatalog2>
     */
    List<BaseCatalog2> baseCatalog2s(Integer catalog1Id);

    /**
     * 根据二级分类信息,返回三级分类信息
     * @param catalog2Id 二级分类ID
     * @return List<BaseCatalog3>
     */
    List<BaseCatalog3> baseCatalog3s(Integer catalog2Id);

    /**
     * 根据三级分类信息,返回详细类别信息
     * @param catalog3Id 三级分类ID
     * @return List<BaseCatalog3>
     */
    List<BaseAttrInfo> getBaseAttrInfoByCatalog3Id(String catalog3Id);

    /**
     * 根据类别信息,返回基础属性值列表
     * @param attrId 属性Id
     * @return List<BaseAttrValue>
     */
    List<BaseAttrValue> getAttrValueListByAttrId(String attrId);

    /**
     * 保存基本属性信息,以及连带的属性值列表
     * @param baseAttrInfo 基本属性信息
     * @return 成功码
     */
    int addAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 删除基本属性信息,以及连带的属性值列表
     * @param attrInfoId 基本属性信息
     * @return 成功码
     */
    int deleteAttrInfo(String attrInfoId);

    /**
     * 更新基本属性信息,以及连带的属性值列表
     * @param baseAttrInfo 基本属性信息
     * @return 成功码
     */
    int updateAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 改变属性启用状态
     * @param attrInfoId 属性id
     * @param isEnabled 是否启用
     * @return 成功码
     */
    int changeAttrInfoStatus(String attrInfoId, String isEnabled);

    /**
     * 改变属性值启用状态
     * @param attrValueId 属性值id
     * @param isEnabled 是否启用
     * @return 成功码
     */
    int changeAttrValueStatus(String attrValueId, String isEnabled);
}
