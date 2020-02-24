package com.datu.fanli.member.service.impl;

import com.datu.fanli.bean.Manager;
import com.datu.fanli.bean.ManagerExample;
import com.datu.fanli.member.dao.ManagerMapper;
import com.datu.fanli.service.IManagerService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/2/23
 */
@Service
public class ManagerServiceImpl implements IManagerService {
    @Resource
    ManagerMapper managerMapper;

    private ManagerExample example;

    @Override
    public String login(String username, String password) {
        example.clear();
        example.createCriteria().andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        if (managerMapper.selectByExample(example)!=null) {
            return "success";
        } else {
            return "fail";
        }
    }

    @Override
    public void changePassword(String username, String newPwd) {
        managerMapper.changePwd(username, newPwd);
    }

    @Override
    public List<Manager> getAllManager() {
        return managerMapper.selectByExample(null);
    }

    @Override
    public void addManager(String username) {
        Manager manager = new Manager();
        manager.setPassword("111111");
        manager.setStatus("0");
        manager.setUsername(username);
        managerMapper.insert(manager);
    }

    @Override
    public void changeStatus(String username, String status) {
        managerMapper.changeStatus(username, status);
    }

    @Override
    public String isExisted(String username) {
        example.clear();
        example.createCriteria().andUsernameEqualTo(username);
        if (managerMapper.selectByExample(example)!=null) {
            return "success";
        } else {
            return "fail";
        }
    }

}
