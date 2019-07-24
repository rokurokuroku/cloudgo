package com.roku.cloudgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.roku.cloudgo.DAO.mapper")
public class CloudgoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudgoApplication.class, args);
    }

}
