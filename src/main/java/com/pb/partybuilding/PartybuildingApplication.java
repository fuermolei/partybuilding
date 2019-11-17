package com.pb.partybuilding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.pb.partybuilding.mapping")
public class PartybuildingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartybuildingApplication.class, args);
    }

}
