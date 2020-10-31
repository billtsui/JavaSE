package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/31
 */
public class StringManyMethodTest {
    public static void main(String[] args) {
        String str1 = "abchelloworld";

        System.out.println(str1.contains("hell")); //true
        System.out.println(str1.contains("owo")); //true
        System.out.println(str1.contains("bill"));//false

        System.out.println(str1.toUpperCase());
        System.out.println(str1);//这里还是原来的str1不会改变

        String str2 = "      Hello World   ";
        System.out.println(str2.trim());

        System.out.println(str1.startsWith("abch"));

        //从下标开始，是否以某个前缀开头
        System.out.println(str1.startsWith("he",3));

        System.out.println(str1.endsWith("rld"));
    }
}
