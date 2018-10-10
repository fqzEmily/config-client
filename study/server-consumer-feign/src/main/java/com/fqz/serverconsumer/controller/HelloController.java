package com.fqz.serverconsumer.controller;

import com.fqz.serverconsumer.service.IClientService;
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
    private IClientService clientService;

    @GetMapping("/hello")
    public String dc(){
        return clientService.dc();

    }
}
