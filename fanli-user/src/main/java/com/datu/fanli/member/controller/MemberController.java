package com.datu.fanli.member.controller;

import com.datu.fanli.member.bean.Member;
import com.datu.fanli.member.service.impl.MemberServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/9
 */
@Controller
@RequestMapping(value = "member")
public class MemberController {
    @Resource
    MemberServiceImpl memberService;

    @RequestMapping(value = "getAllMember")
    @ResponseBody
    public List<Member> getAllMember() {

        return memberService.getAllMember();
    }

}
