package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author geyh
 * @create 2018-08-17 17:39
 */
@Service
public class RibbonHelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(String name) {
        return restTemplate.getForObject("http://hello/hi?name=" + name, String.class);
    }
}
