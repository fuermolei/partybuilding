package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.TBranch;
import com.pb.partybuilding.domain.TVanguard;
import com.pb.partybuilding.domain.Tablepar;
import com.pb.partybuilding.service.VanguardService;
import com.pb.partybuilding.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("VanguardController")
public class VanguardController {
    private String prefix = "tgls/vanguard";
    @Autowired
    private VanguardService vanguardService;

    @GetMapping("view")
    public String view(){
        return prefix+"/list";
    }

    @RequestMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<TVanguard> list = vanguardService.getAll();
        return JSONObject.toJSONString(list);
    }

    @GetMapping("add")
    public String add(){
        return prefix+"/add";
    }

    @PostMapping("add")
    @ResponseBody
    public AjaxResult add(TVanguard tVanguard ){
        tVanguard.setId(SnowflakeIdWorker.getUUID());
        vanguardService.insertSelective(tVanguard);
        return AjaxResult.success();
    }

    @GetMapping("edit")
    public String edit(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TVanguard", vanguardService.selectByPrimaryKey(id));
        return prefix + "/edit";
    }

    @PostMapping("edit")
    @ResponseBody
    public AjaxResult edit(TVanguard tVanguard){
        vanguardService.updateByPrimaryKeySelective(tVanguard);
        return AjaxResult.success();
    }

    @PostMapping("remove")
    @ResponseBody
    public AjaxResult remove(String id){
        int b=vanguardService.deleteByPrimaryKey(id);
        if(b>0){
            return AjaxResult.success();

        }else{
            return AjaxResult.error();
        }
    }

    @RequestMapping(value = "list" , produces = "application/json;charset=UTF-8")
    //@RequiresPermissions("system:user:list")
    @ResponseBody
    public AjaxResult list(HttpServletRequest request, Tablepar tablepar){
        String name=request.getParameter("name");
        PageInfo<TVanguard> page = vanguardService.selectByExample(tablepar,name);
        return AjaxResult.success(page.getTotal(),page.getList());
    }

}
