package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.domain.AjaxResult;
import com.pb.partybuilding.domain.PartymenberTree;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.TTransfer;
import com.pb.partybuilding.domain.Tablepar;
import com.pb.partybuilding.service.PartymemberService;
import com.pb.partybuilding.service.TransferService;
import com.pb.partybuilding.utils.FileUtils;
import com.pb.partybuilding.utils.SnowflakeIdWorker;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 党员档案模块
 */
@Controller
@RequestMapping("PartymemberController")
public class PartymemberController {

    //跳转页面参数
    private String prefix = "tgls/artymember";
    @Autowired
    private PartymemberService partymemberService;
    @Autowired
    private TransferService transferService;

    @GetMapping("view")
    public String view(){
        return prefix+"/list";
    }

    /**
     * 党员列表
     * @param request
     * @param tablepar 分页参数
     * @return
     */
    @RequestMapping(value = "list" , produces = "application/json;charset=UTF-8")
    //@RequiresPermissions("system:user:list")
    @ResponseBody
    public AjaxResult list(HttpServletRequest request, Tablepar tablepar){
        String name=request.getParameter("username");
        PageInfo<TPartymember> page = partymemberService.selectByExample(tablepar,name);
        return AjaxResult.success(page.getTotal(),page.getList());
    }

    /*跳转到添加页面*/
    @GetMapping("add")
    public String add(){
        return prefix+"/add";
    }

    /*执行form表单中上传文件到指定文件夹*/
    @PostMapping("add")
    public ModelAndView add(TPartymember tPartymember ,@RequestParam("headImage") MultipartFile file){
        tPartymember.setId(SnowflakeIdWorker.getUUID());
        if (!file.isEmpty()) {
            String filename = FileUtils.upload(file);//把上传文件写入磁盘并返回文件名
            tPartymember.setPic(filename);
        }
        partymemberService.insertSelective(tPartymember);
        return new ModelAndView("redirect:/PartymemberController/view");
    }

    /*跳转修改页面*/
    @GetMapping("edit")
    public String edit(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TPartymember", partymemberService.selectByPrimaryKey(id));
        return prefix + "/edit";
    }

    /*提交*/
    @PostMapping("edit")
    public ModelAndView edit(TPartymember tPartymember ,@RequestParam("headImage") MultipartFile file){
        if (!file.isEmpty()) {
            String filename = FileUtils.upload(file);
            tPartymember.setPic(filename);
        }
        partymemberService.updateByPrimaryKeySelective(tPartymember);
        return new ModelAndView("redirect:/PartymemberController/view");
    }

    @PostMapping("remove")
    @ResponseBody
    public AjaxResult remove(String ids){
        int b=partymemberService.deleteByPrimaryKey(ids);
        if(b>0){
            return AjaxResult.success();
        }else{
            return AjaxResult.error();
        }
    }

    @GetMapping("transfer")
    public String transfer(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TPartymember", partymemberService.selectByPrimaryKey(id));
        return prefix+"/transfer";
    }

    @PostMapping("transfer")
    public ModelAndView transfer(TTransfer tTransfer , @RequestParam("headImage") MultipartFile file){
        if (!file.isEmpty()) {
            String filename = FileUtils.upload(file);
            tTransfer.setPic(filename);
        }
        transferService.insertSelective(tTransfer);
        return new ModelAndView("redirect:/PartymemberController/view");
    }

    @GetMapping("details")
    public String details(@RequestParam("id") String id, ModelMap mmap){
        mmap.put("TPartymember", partymemberService.selectByPrimaryKey(id));
        return prefix + "/details";
    }

    /**
     * 获取通知对象的tree数据
     * @return
     */
    @GetMapping("getTree")
    @ResponseBody
    public String getTree(){
        System.out.println(JSONObject.toJSONString(partymemberService.getAll()));
        return partymemberService.getAll();
    }

}
