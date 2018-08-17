package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author geyh
 * @create 2018-08-17 14:42
 */
@FeignClient("hello")
public interface HelloService {

    @RequestMapping("/hi")
    public String sayHello(@RequestParam("name") String name);
}
