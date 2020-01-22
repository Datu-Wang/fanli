package com.datu.fanli.manage.controller;

import com.datu.fanli.bean.BaseSaleAttr;
import com.datu.fanli.bean.ProductImage;
import com.datu.fanli.bean.ProductInfo;
import com.datu.fanli.bean.ProductSaleAttr;
import com.datu.fanli.service.IProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: datu
 * @date: 2020/1/15
 */
@RequestMapping(value = "/manage")
@Controller
@CrossOrigin(allowCredentials="true", maxAge = 3600, allowedHeaders = "*")
public class ProductController {
    String productImage = "C:/Users/81519/Desktop/fanli/fanli-manage-web/src/main/resources/static/pro_image/";

    String staticAccessPath = "http://localhost:8084/getFile/pro_image/";

    @Reference
    IProductService productService;

    @RequestMapping(value = "/getProductList")
    @ResponseBody
    List<ProductInfo> getProductList(@RequestParam("catalog3Id") String catalog3Id) {
        return productService.getProductList(catalog3Id);
    }

    @RequestMapping(value = "/getProductSaleAttrList")
    @ResponseBody
    List<ProductSaleAttr> getProductSaleAttrList(@RequestParam("productId") String productId) {
        return productService.getProductSaleAttrList(productId);
    }

    @RequestMapping(value = "/getProductImageList")
    @ResponseBody
    List<ProductImage> getProductImageList(@RequestParam("productId") String productId) {
        return productService.getProductImageList(productId);
    }

    @RequestMapping(value = "/getBaseSaleAttrList")
    @ResponseBody
    List<BaseSaleAttr> getBaseSaleAttrList(@RequestParam("catalog3Id") String catalog3Id) {
        return productService.getBaseSaleAttrList(catalog3Id);
    }

    @RequestMapping(value = "/getProductInfo")
    @ResponseBody
    public ProductInfo getProductInfo(@RequestParam("productInfoId") String productInfoId) {
        return productService.getProductInfoById(productInfoId);
    }

    @RequestMapping(value = "/saveProductInfo", method = RequestMethod.POST)
    @ResponseBody
    public String saveProductInfo(@RequestBody ProductInfo productInfo) {
        productService.saveProductInfo(productInfo);
        return "save success";
    }

    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> upload(MultipartFile file) throws IOException {

        Map<String, String> map = new HashMap<>(2);
        // 获取文件名
        String fileName = file.getOriginalFilename();
        String url = productImage + fileName;
        String accessUrl = staticAccessPath + fileName;
        File dest = new File(url);
        file.transferTo(dest);
        productService.saveProductImage(fileName, accessUrl);
        map.put("name", fileName);
        map.put("url", accessUrl);
        return map;
    }
}
