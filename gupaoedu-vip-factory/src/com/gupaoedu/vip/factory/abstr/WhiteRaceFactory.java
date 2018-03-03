package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.Human;
import com.gupaoedu.vip.factory.WhiteRece;

/**
 * @Author lvrongzhuan
 * @desc:  白种人
 * @createTime 2018/3/3 11:05
 * @Modified by:
 */
public class WhiteRaceFactory extends AbstractHumanFactory{
    @Override
    public Human getHuman() {
        return new WhiteRece();
    }
}
