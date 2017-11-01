package com.youhui.lv.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceFailBack.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "home1",method = RequestMethod.GET)
    String sayHiFromclientOne(@RequestParam(name = "name") String name);
}
