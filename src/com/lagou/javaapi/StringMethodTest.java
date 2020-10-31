package com.lagou.javaapi;

import java.util.Arrays;

/**
 * @author billtsui
 * @date 2020/10/31
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String str1 = "abcd";
        //String 类型转换为byte数组
        //先将字符串拆分为字符，然后再将字符转换为byte类型，也就是获取字符的ASCII
        System.out.println(Arrays.toString(str1.getBytes()));

        String str2 = new String(str1.getBytes());
        System.out.println("转回字符串为 str2 = " + str2);
        System.out.println("---------------------------");

        //将String拆分为char[]
        System.out.println(Arrays.toString(str1.toCharArray()));
        String str4 = new String(str1.toCharArray());
        System.out.println("转回字符串为 str4 = " + str4);

        System.out.println("字符串的长度是：" + str1.length());
        System.out.println("下标为0的字符是：" + str1.charAt(0));
        System.out.println(str1.isEmpty() ? "字符串为空" : "字符串不为空");
    }
}
