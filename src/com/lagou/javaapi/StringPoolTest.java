package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/31
 */
public class StringPoolTest {
    public static void main(String[] args) {
        //验证一下字符串常量池
        String str1 = "abc";
        String str2 = "abc";

        //true
        System.out.println(str1 == str2);
    }
}
