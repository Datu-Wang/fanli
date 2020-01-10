package com.datu.fanli.service;

import com.datu.fanli.bean.Member;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/9
 */
public interface IMemberService {
    /**
     * 返回所有会员
     * @return List<Member>
     */
    List<Member> getAllMember();
}
