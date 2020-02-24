package com.datu.fanli.member.controller;

import com.alibaba.fastjson.JSONObject;
import com.datu.fanli.bean.Manager;
import com.datu.fanli.service.IManagerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: datu
 * @date: 2020/2/23
 */
@Controller
@CrossOrigin
@RequestMapping(value = "manager")
public class ManagerController {
    @Reference(check = false)
    IManagerService managerService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    Map<String, String> login(@RequestBody JSONObject param) {
        Map<String, String> map = new HashMap<>();
        map.put("status", managerService.login(param.getString("username"),param.getString("password")));
        return map;
    }

    @RequestMapping(value = "changeStatus", method = RequestMethod.POST)
    @ResponseBody
    void changeStatus(@RequestBody JSONObject param) {
        managerService.changeStatus(param.get("username").toString(), param.get("status").toString());
    }

    @RequestMapping(value = "getAllManager", method = RequestMethod.GET)
    @ResponseBody
    List<Manager> getAllManager() {
        return managerService.getAllManager();
    }

    @RequestMapping(value = "addManager", method = RequestMethod.POST)
    @ResponseBody
    void addManager(@RequestParam JSONObject param) {
        managerService.addManager(param.getString("username"));
    }

    @RequestMapping(value = "changePassword", method = RequestMethod.POST)
    @ResponseBody
    void changePassword(@RequestParam JSONObject param) {
        managerService.changePassword(param.getString("username"), param.getString("password"));
    }

    @RequestMapping(value = "isExisted", method = RequestMethod.POST)
    @ResponseBody
    Map<String, String> isExisted(@RequestParam JSONObject param) {
        Map<String, String> map = new HashMap<>();
        map.put("status", managerService.isExisted(param.getString("username")));
        return map;
    }
}
