package com.mo.yun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mo.yun.service")
@MapperScan("com.mo.yun.mapper")
public class NongxinMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(NongxinEmplyApplication.class,args);
    }
}
