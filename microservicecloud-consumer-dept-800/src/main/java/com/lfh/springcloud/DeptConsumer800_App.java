package com.lfh.springcloud;

import com.lfh.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//启动微服务时自动加载我们自定义的ribbon配置类，而让设置生效（name="MICROSERVICECLOUD-DEPT"针对的是MICROSERVICECLOUD-DEPT微服务，MySelfRule自己定义的算法）,不是自定义@RibbonClient都不用写
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer800_App{
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer800_App.class,args);
    }



}
