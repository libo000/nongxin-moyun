package com.mo.yun.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.demo")
public class DemoProperties {
    private String name;
    private String select;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "DemoProperties{" + "name='" + name + '\'' + ", select='" + select + '\'' + '}';
    }
}
