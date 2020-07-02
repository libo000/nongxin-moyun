package com.mo.yun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(DemoConfig.class)
@Configuration
public @interface EnbleDemo {
    String  param() default "";
}
