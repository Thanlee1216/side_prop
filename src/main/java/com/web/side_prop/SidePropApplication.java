package com.web.side_prop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.web.side_prop.repository")
@SpringBootApplication
public class SidePropApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidePropApplication.class, args);
    }

}
