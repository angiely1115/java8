package com.youhui.lv.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.naming.Name;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String helloService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/home1?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi".concat(name).concat("sorry");
    }

}
