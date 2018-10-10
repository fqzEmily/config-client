package com.fqz.serverconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("server-client")
public interface IClientService {
    @GetMapping("/dc")
    public String dc();
}
