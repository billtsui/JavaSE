package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/31
 */
public class StringConstructorTest {
    public static void main(String[] args) {
        //1、使用无参方式构造对象
        String str1 = new String();

        //打印空字符串对象 ""
        System.out.println("str1 = " + str1);

        System.out.println("--------------------------");

        byte[] bytes = {97, 98, 99, 100};
        //从数组中下标为0的地方开始的4个字节构造字符串对象
        String str2 = new String(bytes, 0, 4);
        System.out.println("str2 + " + str2);


        System.out.println("---------------------------------");

        //使用字符数组构造字符串对象
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};

        //从下标0开始，使用3个字符
        String str3 = new String(cArr, 0, 3);

        //hel
        System.out.println("str3 = " + str3);

        String str4 = new String(cArr);
        System.out.println("str4 = " + str4);
    }
}
