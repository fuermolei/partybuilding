package com.pb.partybuilding.common.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * @Description: 对文件的路径进行配置, 创建一个虚拟路径/temp-rainy/** ，即只要在<img src="/temp-rainy/picName.jpg" />便可以直接引用图片
         * classpath:/rules/这是图片的物理路径，temp-rainy是文件夹  "file:/+本地图片的地址"
         */
        registry.addResourceHandler("/temp-rainy/**").addResourceLocations("file:D:/temp-rainy/");
    }
}
