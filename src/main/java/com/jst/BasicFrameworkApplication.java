package com.jst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jst.mapper")
public class BasicFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicFrameworkApplication.class, args);
    }

}

