package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.TTransfer;
import com.pb.partybuilding.domain.Tablepar;
import com.pb.partybuilding.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("TransferController")
public class TransferController {

    //跳转页面参数
    private String prefix = "tgls/transfer";
    @Autowired
    private TransferService transferService;

    @GetMapping("view")
    public String view(){
        return prefix+"/list";
    }

    @RequestMapping(value = "list" , produces = "application/json;charset=UTF-8")
    //@RequiresPermissions("system:user:list")
    @ResponseBody
    public AjaxResult list(HttpServletRequest request, Tablepar tablepar){
        String name=request.getParameter("username");
        PageInfo<TTransfer> page = transferService.selectByExample(tablepar,name);
        return AjaxResult.success(page.getTotal(),page.getList());
    }

}
