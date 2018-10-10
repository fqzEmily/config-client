package com.fqz.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * @EnableEurekaServer：启动一个服务注册中心*/
@EnableEurekaServer
@SpringBootApplication
public class ServiceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaApplication.class, args);
    }
}
