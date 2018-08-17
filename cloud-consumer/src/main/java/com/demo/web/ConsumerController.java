package com.demo.web;

import com.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geyh
 * @create 2018-08-17 14:41
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String getHelloResult(String name) {
        return helloService.sayHello(name);
    }
}
