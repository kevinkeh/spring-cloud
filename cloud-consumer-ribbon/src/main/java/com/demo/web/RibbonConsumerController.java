package com.demo.web;

import com.demo.service.RibbonHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geyh
 * @create 2018-08-17 14:41
 */
@RestController
public class RibbonConsumerController {

    @Autowired
    private RibbonHelloService ribbonHelloService;

    @RequestMapping("/hello")
    public String getHelloResult(@RequestParam("name") String name) {
        return ribbonHelloService.sayHello(name);
    }
}
