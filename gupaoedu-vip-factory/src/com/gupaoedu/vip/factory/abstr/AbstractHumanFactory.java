package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.Human;

/**
 * @Author lvrongzhuan
 * @desc:
 * @createTime 2018/3/311:02
 * @Modified by:
 */
public abstract class  AbstractHumanFactory {
    //获取人种
    public abstract Human getHuman();

    public Human getHuman(String name){
        if("Y".equals(name)){
            return new YellowRaceFactory().getHuman();
        }else if("W".equals(name)){
            return new WhiteRaceFactory().getHuman();
        }else if("B".equals(name)){
            return new BlackRaceFactory().getHuman();
        }else {
            return null;
        }
    }
}
