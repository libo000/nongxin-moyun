package com.mo.yun;

import com.sun.org.apache.xpath.internal.operations.And;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
@MapperScan("com.mo.yun.mapper")
public class NongxinEmplyApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NongxinEmplyApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 5)
                .filter(item -> item > 3)
                .forEach(System.out::println);// 打印结果：4，5
    }
}
