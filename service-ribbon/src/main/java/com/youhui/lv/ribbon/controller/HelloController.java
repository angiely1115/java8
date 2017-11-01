package com.youhui.lv.ribbon.controller;
import com.youhui.lv.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("helloribbon")
    public String helloRibbon(String name){
      return helloService.helloService(name);
    }

    /**
     * zuul路由功能测试
     * @param name
     * @return
     */
    @RequestMapping("zuul")
    public String helloZuul(String name){
        return helloService.helloService("ribbon-zuul".concat(name));
    }
}
