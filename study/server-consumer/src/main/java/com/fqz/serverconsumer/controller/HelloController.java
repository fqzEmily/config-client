package com.fqz.serverconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fuqiaozhen   on 2018/10/10
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello")
    public String dc(){
        //使用负载均衡的方式获取服务提供者的注册信息
        ServiceInstance serviceInstance = loadBalancerClient.choose("server-client");
        //拼装调用服务提供者接口的URL
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/dc";
        System.out.println(url);
        //调用服务提供者的接口
        return "url="+url+"\n"+restTemplate.getForObject(url,String.class);

    }
}
