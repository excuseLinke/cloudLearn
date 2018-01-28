package com.linke;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServiceBoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBoyApplication.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/boy")
	public  String home(@RequestParam String name){
		return "boy"+name+"：My port is :"+port;
	}
}
