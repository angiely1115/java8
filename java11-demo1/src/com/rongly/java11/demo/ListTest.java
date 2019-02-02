package com.rongly.java11.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/2/1 10:28
 * @Version: 1.0
 * modified by:
 */
public class ListTest {
    /**
     * 快速创建集合
     */
    @Test
    public void listCreate(){
        //创建的list是不可变的 意思是不能动态添加、删除元素
       List<Object> objects = List.of(1,2,3,"lvr");
        System.out.println(objects);
//        objects.remove("1");
        System.out.println(objects);

        //也是不能动态添加和删除元素哦
        List<Integer> integers = Arrays.asList(1,2,3);

        //同样map set都可以使用of来创建
       Map<String,String> map = Map.of("11","baisuz");
        System.out.println(map);
        Set<Integer> integerSet = Set.of(1,2,345,6);
        System.out.println("set:"+integerSet);
        Stream.of(1,2,3).mapToDouble(new ToDoubleFunction<Integer>() {
            @Override
            public double applyAsDouble(Integer value) {
                System.out.println(value);
                return 0;
            }
        }).max().ifPresent(r-> System.out.println(r));
    }
}
