package com.rongly.java11.demo;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * @Author: lvrongzhuan
 * @Description: 流测试
 * @Date: 2019/2/1 11:08
 * @Version: 1.0
 * modified by:
 */
public class StreamTest {

    @Test
    public void streamTest(){
       Stream<String> stringStream = Stream.of("xuxian","lvrongzhuan","pengxuemei","zhaoyazhi","dilireba");
//       stringStream.forEach(System.out::println);
       Stream.ofNullable(null);
       //根据过滤元素 直到元素第一次返回false终止  不管后面是否有符合条件的元素 如果第一个元素就是false 不好意思 他终止了 没有返回任何元素  哈哈
       stringStream.takeWhile(s->s.length()<11).forEach(System.out::println);
    }

    @Test
    public void streamTest2(){
        Stream<String> stringStream = Stream.of("xuxian","lvrongzhuan","pengxuemei","zhaoyazhi","dilireba");
//       stringStream.forEach(System.out::println);
        Stream.ofNullable(null);
        //根据过滤元素 直到元素第一次返回false终止 保留后面所有的元素 不管后面是否有元素符合条件 如果第一个元素就是false 不好意思 他终止了 会保留所有元素 哈哈
        stringStream.dropWhile(s->s.length()<11).forEach(System.out::println);
    }

    @Test
    public void streamTest3(){
        //创建一个迭代有限流
        Stream.iterate(1,r->r<1000,r->r*2+1).forEach(System.out::println);
    }
}
