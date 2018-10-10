package com.fqz.serverclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fuqiaozhen   on 2018/10/10
 */
@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        List<String> serviceList = discoveryClient.getServices();
        for (String str:serviceList) {
            System.out.println(str);
        }
        return "services:"+serviceList;
    }
}
