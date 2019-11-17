package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import com.pb.partybuilding.domain.TVanguard;
import com.pb.partybuilding.service.VanguardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("VanguardController")
public class VanguardController {

    @Autowired
    private VanguardService vanguardService;

    @RequestMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<TVanguard> list = vanguardService.getAll();
        return JSONObject.toJSONString(list);
    }
}
