package com.lv.javase.practice.reflex;

/**
 * @Author lvrongzhuan
 * @desc: 反射测试类
 * @createTime 2018/2/27 16:36
 * @Modified by:
 */
public class ReflexTest {
    /**
     * 三种方式获取Class对象 运行期间，一个类只产生一个Class对象
     * @param args
     */
    public static void main(String[] args) {
        //第一种方式获取Class对象
        Student stu1 = new Student();//这一new 产生一个Student对象，一个Class对象。
        Class stuClass = stu1.getClass();//获取Class对象
        System.out.println("class名称："+stuClass.getName());

        //第二种方式获取Class对象
        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个

        //第三种方式获取Class对象
        try {
            Class stuClass3 = Class.forName("com.lv.javase.practice.reflex.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
            System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
