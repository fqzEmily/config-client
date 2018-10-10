package com.fqz.serverclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerClientApplication.class, args);
    }
}
