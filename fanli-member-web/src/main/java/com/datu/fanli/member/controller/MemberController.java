package com.datu.fanli.member.controller;

import com.datu.fanli.bean.Member;
import com.datu.fanli.service.IMemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: datu
 * @date: 2020/1/9
 */
@Controller
@RequestMapping(value = "member")
public class MemberController {
    @Reference(check = false)
    IMemberService memberService;

    @RequestMapping(value = "getAllMember")
    @ResponseBody
    public List<Member> getAllMember() {
        return memberService.getAllMember();
    }

}
