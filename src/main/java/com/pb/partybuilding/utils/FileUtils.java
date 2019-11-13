package com.pb.partybuilding.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtils {

    /**
     * 把上传文件写入磁盘并返回文件名
     * @param file MultipartFile文件
     * @return
     */
    public static String upload(MultipartFile file){
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = "D://temp-rainy//"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = "/temp-rainy/" + fileName;
        return filename;
    }
}
