package com.lv.youhui8;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author lvrongzhuan
 * @desc:
 * @createTime 2017/10/3015:02
 * @Modified by:
 */
public class Java8Demo {


    @Test
    public void  testLambda(){
        List<Integer> integerList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            integerList.add(i);
        }
        integerList.forEach(e -> System.out.print(e));
    }

    @Test
    public void testStream(){
        List<Integer> integerList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            integerList.add(i);
        }
        integerList.add(null);
        integerList.add(null);
        System.out.println(integerList.stream()
                .count());
        System.out.println(integerList.stream().filter(temp->temp!=null)
        .collect(Collectors.toList()));
    }

    @Test
    public void testMap(){
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("小白", 10);
        items.put("小文", 20);
        items.put("小君", 30);
        items.put("KD", 40);
        items.put("ws", 50);
        items.put("XJ", 60);
        items.forEach((k,v)-> System.out.println("k："+k+" v:"+v));
        for (String key:items.keySet()){

        }
    }
}
