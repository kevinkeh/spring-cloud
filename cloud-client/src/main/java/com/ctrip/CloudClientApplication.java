package com.ctrip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geyh
 * @create 2018-08-15 19:19
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
@RestController
public class CloudClientApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

    @RequestMapping("/hi")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " I am from port:" + port;
    }
}
