package com.datu.fanli.manage.controller;

import com.alibaba.fastjson.JSONObject;
import com.datu.fanli.bean.*;
import com.datu.fanli.service.ICatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/11
 */
@RequestMapping(value = "/manage")
@Controller
@CrossOrigin
public class CatalogController {
    @Reference
    ICatalogService catalogService;

    @RequestMapping(value = "/getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> baseCatalog1s() {
        return catalogService.baseCatalog1s();
    }

    @RequestMapping(value = "/getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> baseCatalog2s(@RequestParam("catalog1Id") Integer catalog1Id) {
        return catalogService.baseCatalog2s(catalog1Id);
    }

    @RequestMapping(value = "/getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> baseCatalog3s(@RequestParam("catalog2Id") Integer catalog2Id) {
        return catalogService.baseCatalog3s(catalog2Id);
    }

    @RequestMapping(value = "/attrInfoList")
    @ResponseBody
    public List<BaseAttrInfo> getBaseAttrInfoByCatalog3Id(@RequestParam("catalog3Id") String catalog3Id) {
        return catalogService.getBaseAttrInfoByCatalog3Id(catalog3Id);
    }

    @RequestMapping(value = "/getAttrValueList")
    @ResponseBody
    public List<BaseAttrValue> getAttrValueListByAttrId(@RequestParam("attrId") String attrId) {
        return catalogService.getAttrValueListByAttrId(attrId);
    }

    @RequestMapping(value = "/saveAttrInfo", method = RequestMethod.POST)
    @ResponseBody
    public int saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo) {
        catalogService.addAttrInfo(baseAttrInfo);
        return 1;
    }

    @RequestMapping(value = "/updateAttrInfo", method = RequestMethod.POST)
    @ResponseBody
    public int updateAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo) {
        catalogService.updateAttrInfo(baseAttrInfo);
        return 1;
    }

    @RequestMapping(value = "/deleteAttrInfoById", method = RequestMethod.POST)
    @ResponseBody
    public int deleteAttrInfoById(@RequestParam("attrInfoId") String attrInfoId) {
        catalogService.deleteAttrInfo(attrInfoId);
        return 1;
    }

    /**
     * 用JSONObject来避免@RequestParam接收不到参数
     * @param param
     * @return
     */
    @RequestMapping(value = "/changeAttrInfoStatus", method = RequestMethod.POST)
    @ResponseBody
    public int changeAttrInfoStatus(@RequestBody JSONObject param) {
        catalogService.changeAttrInfoStatus(param.get("attrInfoId").toString(), param.get("isEnabled").toString());
        return 1;
    }

    @RequestMapping(value = "/changeAttrValueStatus", method = RequestMethod.POST)
    @ResponseBody
    public int changeAttrValueStatus(@RequestBody JSONObject param) {
        catalogService.changeAttrValueStatus(param.get("attrValueId").toString(), param.get("isEnabled").toString());
        return 1;
    }
}
