package com.lagou.javafundamental;

import java.util.Scanner;

/**
 * 使用while计算调和数列的和
 */
public class WhileSum {
    public static void main(String[] args) {
        // 1、提示用户输入一个整数
        // 2、计算调和数列的和

        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        double result = 0;
        while (i <= num) {
            result += 1.0 / i;
            i++;
        }

        System.out.println(result);
    }
}
