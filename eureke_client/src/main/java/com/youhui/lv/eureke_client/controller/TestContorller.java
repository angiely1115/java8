package com.youhui.lv.eureke_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestContorller {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${server.port}")
    String port;
    @RequestMapping(value = "home1",method = RequestMethod.GET)
    public String home(String name){
        return "hello eureku:".concat(name).concat("port:").concat(port);
    }
    @RequestMapping(value = "home2",method = RequestMethod.GET)
    public String home2(String name){
        return restTemplate.getForObject("http://SERVICE-RIBBON:7864/helloribbon",String.class);
    }


}
