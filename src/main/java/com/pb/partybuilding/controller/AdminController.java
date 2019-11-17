package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private static Logger logger= LoggerFactory.getLogger(AdminController.class);

    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        return "frame";
    }

    @GetMapping("/tglsIndex")
    public String tglsindex(HttpServletRequest request) {
        return "tgls/index";
    }

}
