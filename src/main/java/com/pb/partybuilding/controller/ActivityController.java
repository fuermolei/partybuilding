package com.pb.partybuilding.controller;

import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.TActivity;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.Tablepar;
import com.pb.partybuilding.service.ActivityService;
import com.pb.partybuilding.utils.FileUtils;
import com.pb.partybuilding.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 会务活动
 */
@Controller
@RequestMapping("ActivityController")
public class ActivityController {

    //跳转页面参数
    private String prefix = "tgls/activity";

    @Autowired
    public ActivityService activityService;

    @GetMapping("view")
    public String view(){
        return prefix+"/list";
    }

    @RequestMapping(value = "list" , produces = "application/json;charset=UTF-8")
    //@RequiresPermissions("system:user:list")
    @ResponseBody
    public AjaxResult list(HttpServletRequest request, Tablepar tablepar){
        String name=request.getParameter("username");
        PageInfo<TActivity> page = activityService.selectByExample(tablepar,name);
        return AjaxResult.success(page.getTotal(),page.getList());
    }

    @GetMapping("add")
    public String add(){
        return prefix+"/add";
    }

    @PostMapping("add")
    public ModelAndView add(TActivity tActivity , @RequestParam("headImage") MultipartFile file){
        tActivity.setId(SnowflakeIdWorker.getUUID());
        if (!file.isEmpty()) {
            String filename = FileUtils.upload(file);//把上传文件写入磁盘并返回文件名
            tActivity.setPic(filename);
        }
        activityService.insertSelective(tActivity);
        return new ModelAndView("redirect:/ActivityController/view");
    }

    @GetMapping("edit")
    public String edit(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TActivity", activityService.selectByPrimaryKey(id));
        return prefix + "/edit";
    }

    @PostMapping("edit")
    public ModelAndView edit(TActivity tActivity,@RequestParam("headImage") MultipartFile file){
        if (!file.isEmpty()) {
            String filename = FileUtils.upload(file);
            tActivity.setPic(filename);
        }
        activityService.updateByPrimaryKeySelective(tActivity);
        return new ModelAndView("redirect:/ActivityController/view");
    }

    @PostMapping("remove")
    @ResponseBody
    public AjaxResult remove(String ids){
        int b=activityService.deleteByPrimaryKey(ids);
        if(b>0){
            return AjaxResult.success();
        }else{
            return AjaxResult.error();
        }
    }

    @GetMapping("tree")
    public String tree(){
        return prefix+"/tree";
    }

    @GetMapping("signup")
    public String signup(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TActivity", activityService.selectByPrimaryKey(id));
        return prefix+"/signup";
    }
}
