package com.luban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.luban.*.dao")
@SpringBootApplication
@EnableCaching
public class LubanApplication {
    public static void main(String[] args) {
        SpringApplication.run(LubanApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    LubanBoot启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
    }
}
