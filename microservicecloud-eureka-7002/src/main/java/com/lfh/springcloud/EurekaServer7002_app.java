package com.lfh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启动，标注我是EurekaServer，启动组件注解标签
public class EurekaServer7002_app {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_app.class,args);
    }

}
