package com.zhou.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zyh
 * @create 2023-02-03 16:11
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zhou.user.mapper")
@ComponentScan("com.zhou")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
