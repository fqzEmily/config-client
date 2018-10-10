package com.fqz.serverconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConsumerApplication.class, args);
    }
}
