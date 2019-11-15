package com.pb.partybuilding.controller;

import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.service.PartymemberService;
import com.pb.partybuilding.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("SignUpController")
public class SignUpController {

    @Autowired
    private SignUpService signUpService;
    @Autowired
    private PartymemberService partymemberService;

    @GetMapping("checkUp")
    public AjaxResult checkUp(String id,String idnumber){
        if(signUpService.checkUp(id,idnumber)>0){
            return AjaxResult.success();
        }else {
            return AjaxResult.error();
        }
    }

}
