package com.datu.fanli.service;

import com.datu.fanli.bean.Manager;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/2/22
 */
public interface IManagerService {
    /**
     * 登录
     * @param username
     * @param password
     * @return 'success' or 'fail'
     */
    String login(String username, String password);

    /**
     * 修改密码
     * @param username 用户名
     * @param newPwd 新密码
     */
    void changePassword(String username, String newPwd);

    /**
     * 获取全部管理员
     * @return
     */
    List<Manager> getAllManager();

    void addManager(String username);

    void changeStatus(String username, String status);

    String isExisted(String username);
}
