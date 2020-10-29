package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/28
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1001,"张飞");
        Student s2 = new Student(1001,"关羽");

        //如果Student类重写了equals方法，则调用重写以后的版本，比较内容
        System.out.println(s1.equals(s2));
        //比较地址
        System.out.println(s1 == s2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
