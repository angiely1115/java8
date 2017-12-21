package com.youhui.lv;

import java.text.MessageFormat;
import java.util.*;

/**
 * @Author lvrongzhuan
 * @desc:
 * @createTime 2017/12/1411:45
 * @Modified by:
 */
public class Test1 {

    public static void main(String[] args) {
        Object object = new Object();
        Test1 test1 = new Test1();
        System.out.println("****"+Test1.class.getClassLoader());
        System.out.println("****"+test1.getClass().getClassLoader().getParent());
        long maxMemory = Runtime.getRuntime().maxMemory() ;//返回 Java 虚拟机试图使用的最大内存量。
        long totalMemory = Runtime.getRuntime().totalMemory() ;//返回 Java 虚拟机中的内存总量。
        System.out.println("MAX_MEMORY = " + maxMemory + "（字节）、" + (maxMemory / (double)1024 / 1024) + "MB");
        System.out.println("TOTAL_MEMORY = " + totalMemory + "（字节）、" + (totalMemory / (double)1024 / 1024) + "MB");
        String str2 = new String("str")+new String("01");
        str2.intern();
        String str1 = "str01";
        System.out.println(str2==str1);//#7
        final int count = 0;
        List<String> strings = Arrays.asList("a", "b", "c");
        strings.forEach(System.out::print);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }
        System.out.println("************:"+list);
        list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        //反例：
        for (String item : list) {
            if ("6".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println("************:"+list);

        String str = "订单状态提醒：您的订单将于{0}小时内自动确认收货。确认收货后，会在3个工作日内结算货款。";
        System.out.println(MessageFormat.format(str,24));
    }
}
