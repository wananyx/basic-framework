package com.jst.basic.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jst.basic.framework.dao")
public class BasicFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicFrameworkApplication.class, args);
    }

}

