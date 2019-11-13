package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import com.pb.partybuilding.domain.TBranch;
import com.pb.partybuilding.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("BranchController")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @RequestMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<TBranch> list = branchService.getAll();
        return JSONObject.toJSONString(list);
    }

}
