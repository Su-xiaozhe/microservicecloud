package com.lfh.springcloud.cfgbeans;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具，这样写让客户端通过RestTemplate访问微服务时自带负载均衡
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	//不定义下面的话，就是默认的轮询方法
	@Bean
	public IRule myRule()
	{
		//return new RoundRobinRule();
		return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//		return new RetryRule();
	}
}
//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">