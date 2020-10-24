package com.lagou.javafundamental;

import java.util.Scanner;

public class ArithmeticTimeTest {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数的秒数：");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        sc.close();

        int hour = seconds / 60 / 60;
        int minute = (seconds - (hour * 60 * 60)) / 60;
        int second = seconds - hour * 60 * 60 - minute * 60;

        System.out.println(hour + "时" + minute + "分" + second + "秒");
    }
}