package com.liuqi.mi.controller;

import com.liuqi.mi.common.R;
import com.liuqi.mi.common.phoneVerCode.SendMessage;
import com.liuqi.mi.entity.Member;
import com.liuqi.mi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/Member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/getAllMember")
    @ResponseBody
    public R getAllMember(Member member){
        return R.ok(memberService.getAllMember(member));
    }

    @RequestMapping("/getMemberByMember_id")
    @ResponseBody
    public R getMemberByMember_id(int member_id){
        return R.ok(memberService.getMemberByMember_id(member_id));
    }

    @RequestMapping("/getMember_id")
    @ResponseBody
    public R getMember_id(){
        return R.ok(memberService.getMember_id());
    }

    @RequestMapping("/getMemberCount")
    @ResponseBody
    public R getMemberCount(Member member){
        return R.ok(memberService.getMemberCount(member));
    }

    @RequestMapping("/InsertMember")
    @ResponseBody
    public R InsertMember(Member member){
        return R.ok(memberService.InsertMember(member));
    }

    @RequestMapping("/UpdateMember")
    @ResponseBody
    public R UpdateMember(Member member){
        return R.ok(memberService.UpdateMember(member));
    }

    @RequestMapping("/member_del")
    @ResponseBody
    public R member_del(int member_id){
        return R.ok(memberService.member_del(member_id));
    }

    @RequestMapping("/member_Moredel")
    @ResponseBody
    public R member_Moredel(@RequestBody List<Integer> member_ids){
        return R.ok(memberService.member_Moredel(member_ids));
    }

    @RequestMapping("/UpdateMember_state")
    @ResponseBody
    public R UpdateMember_state(int member_id, String member_state){
        return R.ok(memberService.UpdateMember_state(member_id,member_state));
    }

    @RequestMapping("/Reset_password")
    @ResponseBody
    public R Reset_password(int member_id){
        return R.ok(memberService.Reset_password(member_id));
    }

    @RequestMapping("/SendVerificationCode")
    @ResponseBody
    public void SendVerificationCode(String phone,String code){
        System.out.println(phone);
        System.out.println(code);
        SendMessage sendMessage=new SendMessage();
        sendMessage.EX(phone,code);
    }
}
