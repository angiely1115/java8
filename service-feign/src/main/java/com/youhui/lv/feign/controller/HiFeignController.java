package com.youhui.lv.feign.controller;

import com.youhui.lv.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiFeignController {
//    @Qualifier("schedualServiceFailBack") 总是失败
    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @RequestMapping("hifeign")
    public String hiFeignOne(String name){
       return schedualServiceHi.sayHiFromclientOne(name);
    }
    /**
     * zuul路由功能测试
     * @param name
     * @return
     */
    @RequestMapping("zuul")
    public String helloZuul(String name){
        return schedualServiceHi.sayHiFromclientOne("feign-zuul".concat(name));
    }
}
