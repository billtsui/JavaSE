package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/31
 */
public class StringSearchTest {
    public static void main(String[] args) {
        String str1 = "Good Good Study,Day Day Up!";
        System.out.println("str1 = " + str1);

        //不存在就返回-1，存在就返回下标
        System.out.println(str1.indexOf("g"));

        int pos = str1.indexOf("G");
        System.out.println("pos = " + pos);

        System.out.println("---------------------");
        System.out.println(str1.indexOf("day"));  //-1

        System.out.println(str1.indexOf('G', 1)); //5

        //编写通用代码，找出所有的Day

        int pos1 = 0;
        while ((pos1 = str1.indexOf("Day",pos1)) != -1) {
            System.out.println("pos1 = " + pos1);
            pos1 += "Day".length();
        }

        System.out.println("----------------------");

        //反向查找
        int pos2 = str1.lastIndexOf("G");
        System.out.println("pos2 = " + pos2);
    }
}
