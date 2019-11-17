package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import com.pb.partybuilding.domain.TBranch;
import com.pb.partybuilding.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.TBranch;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.Tablepar;
import com.pb.partybuilding.service.BranchService;
import com.pb.partybuilding.utils.FileUtils;
import com.pb.partybuilding.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("BranchController")
public class BranchController {

    @Autowired
    private BranchService branchService;

    private String prefix = "tgls/branch";

    @GetMapping("view")
    public String view(){
        return prefix+"/list";
    }

    @RequestMapping(value = "list" , produces = "application/json;charset=UTF-8")
    //@RequiresPermissions("system:user:list")
    @ResponseBody
    public AjaxResult list(HttpServletRequest request, Tablepar tablepar){
        String name=request.getParameter("name");
        PageInfo<TBranch> page = branchService.selectByExample(tablepar,name);
        return AjaxResult.success(page.getTotal(),page.getList());
    }
    @GetMapping("add")
    public String add(){
        return prefix+"/add";
    }

    @PostMapping("add")
    @ResponseBody
    public AjaxResult add(TBranch tBranch ){
        tBranch.setId(SnowflakeIdWorker.getUUID());
        branchService.insertSelective(tBranch);
        return AjaxResult.success();
    }

    @RequestMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<TBranch> list = branchService.getAll();
        return JSONObject.toJSONString(list);
    }

    @GetMapping("edit")
    public String edit(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TBranch", branchService.selectByPrimaryKey(id));
        return prefix + "/edit";
    }

    @PostMapping("edit")
    @ResponseBody
    public AjaxResult edit(TBranch tBranch){
        branchService.updateByPrimaryKeySelective(tBranch);
        return AjaxResult.success();
    }

    @PostMapping("remove")
    @ResponseBody
    public AjaxResult remove(String id){
        int b=branchService.deleteByPrimaryKey(id);
        if(b>0){
            return AjaxResult.success();

        }else{
            return AjaxResult.error();
        }
    }
}
