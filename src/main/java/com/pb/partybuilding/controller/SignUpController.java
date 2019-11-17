package com.pb.partybuilding.controller;

import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.service.PartymemberService;
import com.pb.partybuilding.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("SignUpController")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;
    @Autowired
    private PartymemberService partymemberService;

    @PostMapping("checkUp")
    @ResponseBody
    public AjaxResult checkUp(String id,String idnumber){
        if(signUpService.checkUp(id,idnumber)>0){
            return AjaxResult.success("签到成功！");
        }else {
            return AjaxResult.error("签到失败，请检查您输入的身份证号是否正确或者查询您是否是本次活动邀请对象!");
        }
    }



}
