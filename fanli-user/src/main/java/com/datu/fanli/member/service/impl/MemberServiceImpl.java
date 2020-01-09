package com.datu.fanli.member.service.impl;

import com.datu.fanli.member.bean.Member;
import com.datu.fanli.member.bean.MemberExample;
import com.datu.fanli.member.dao.MemberMapper;
import com.datu.fanli.member.service.IMemberService;
import org.springframework.stereotype.Service;

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
        MemberExample example = new MemberExample();
        example.createCriteria();
        return memberMapper.selectByExample(example);
    }
}
