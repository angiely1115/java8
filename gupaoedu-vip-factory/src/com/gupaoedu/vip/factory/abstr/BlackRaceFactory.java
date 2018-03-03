package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.BlackRace;
import com.gupaoedu.vip.factory.Human;
import com.gupaoedu.vip.factory.abstr.AbstractHumanFactory;

/**
 * @Author lvrongzhuan
 * @desc:  黑种人
 * @createTime 2018/3/3 11:07
 * @Modified by:
 */
public class BlackRaceFactory extends AbstractHumanFactory{
    @Override
    public Human getHuman() {
        return new BlackRace();
    }
}
