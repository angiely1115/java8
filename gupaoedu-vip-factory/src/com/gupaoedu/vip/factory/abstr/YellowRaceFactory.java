package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.Human;
import com.gupaoedu.vip.factory.YellowRace;

/**
 * @Author lvrongzhuan
 * @desc: 黄种人
 * @createTime 2018/3/3 11:04
 * @Modified by:
 */
public class YellowRaceFactory extends AbstractHumanFactory{
    @Override
    public Human getHuman() {
        return new YellowRace();
    }
}
