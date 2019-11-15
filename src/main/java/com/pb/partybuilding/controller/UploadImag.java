package com.pb.partybuilding.controller;

import com.alibaba.fastjson.JSON;
import com.pb.partybuilding.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 富文本图片上传方法
 */
@RestController
@RequestMapping("/uploadFile")
public class UploadImag {

    @RequestMapping(value = "/wangEditUploadImag", method = RequestMethod.POST)
    public Object wangEditUploadImag(@RequestParam(value = "files", required = false) List<MultipartFile> files, HttpServletRequest request) {
        System.out.println("进入上传图片方法。。。");
        ConcurrentMap<String, Object> object = new ConcurrentHashMap<>();
        String imgUrls[] = new String[files.size()];
        try {
            if(files != null&&files.size()>0) {
                for (int i = 0; i < files.size(); i++) {
                    MultipartFile file = files.get(i);
                    /*
                     * servcie保存file
                     * 这里根据自己的上传服务器方法来实现
                     */
                    String url = FileUtils.upload(file);
                    imgUrls[i] = url ;

                }
            }
            //成功的话
            object.put("errno","0");
            object.put("data", imgUrls);
            return JSON.toJSONString(object);
        } catch (Exception e) {
            //这里errno随便设置多少,只要不是0
            object.put("errno","500");
            object.put("msg","服务器异常");
            return JSON.toJSONString(object);
        }
    }
}
