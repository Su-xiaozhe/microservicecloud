package com.lfh.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.lfh.springcloud"})//api中的service一定会被扫描到
@ComponentScan("com.lfh")//@SpringBootApplication有ComponentScan注解了，这样SpringBootApplication的ComponentScan注解会失效，最好范围不一样
public class DeptConsumer800_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer800_Feign_App.class,args);
    }

}
