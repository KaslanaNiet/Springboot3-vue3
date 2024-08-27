package com.niet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.niet.mapper")  // 确保扫描到 UserMapper 所在的包
public class BigEventApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigEventApplication.class, args);
    }
}