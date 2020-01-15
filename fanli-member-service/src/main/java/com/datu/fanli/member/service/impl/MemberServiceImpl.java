package com.datu.fanli.member.service.impl;

import com.datu.fanli.bean.Member;
import com.datu.fanli.bean.MemberExample;
import com.datu.fanli.member.dao.MemberMapper;
import com.datu.fanli.service.IMemberService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/9
 */
@Service
public class MemberServiceImpl implements IMemberService {
    @Resource
    MemberMapper memberMapper;

    @Override
    public List<Member> getAllMember() {
        return memberMapper.selectByExample(null);
    }
}
