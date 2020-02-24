package com.datu.fanli.manage.controller;

import com.datu.fanli.bean.SkuInfo;
import com.datu.fanli.service.ISkuService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/23
 */
@RequestMapping(value = "/manage")
@Controller
@CrossOrigin(allowCredentials="true", maxAge = 3600, allowedHeaders = "*")
public class SkuController {
    @Reference
    ISkuService skuService;

    @RequestMapping(value = "getSkuList")
    @ResponseBody
    List<SkuInfo> getSkuList(@RequestParam("productInfoId") String productInfoId) {
        return skuService.getSkuListByProductInfoId(productInfoId);
    }

    @RequestMapping(value = "getSkuInfo")
    @ResponseBody
    SkuInfo getSkuInfo(@RequestParam("skuId") String skuId) {
        return skuService.getSkuInfoById(skuId);
    }

    @RequestMapping(value = "saveSkuInfo", method = RequestMethod.POST)
    @ResponseBody
    String saveSkuInfo(@RequestBody SkuInfo skuInfo) {
        return skuService.saveSkuInfo(skuInfo);
    }

    @RequestMapping(value = "deleteSku", method = RequestMethod.POST)
    @ResponseBody
    void deleteSku(@RequestParam("skuId") String skuId) {
        skuService.deleteSkuInfo(skuId);
    }
}
