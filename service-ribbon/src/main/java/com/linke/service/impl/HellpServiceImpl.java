package com.linke.service.impl;

import com.linke.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by linke on 2018/1/28.
 */
@Service
public class HellpServiceImpl implements HelloService {
    @Autowired
    RestTemplate restTemplate;
    @Override
    @HystrixCommand(fallbackMethod = "boyError")
    public String boyService(String name){
        return restTemplate.getForObject("http://service-boy/boy?name="+name,String.class);
    }
    public String  boyError(String name){
        return "hello"+name+",excuse error!";
    }
}
