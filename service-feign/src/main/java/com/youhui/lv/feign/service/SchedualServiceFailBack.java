package com.youhui.lv.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceFailBack implements SchedualServiceHi{

    @Override
    public String sayHiFromclientOne(String name) {
        return "hi:".concat(name).concat("sorry" +
                "");
    }
}
