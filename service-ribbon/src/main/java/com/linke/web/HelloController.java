package com.linke.web;

import com.linke.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linke on 2018/1/28.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return helloService.boyService(name);
    }
}
