package com.lagou.javafundamental;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCountTest {
    public static void main(String[] args) {
        // 1、提示用户输入一个正整数
        System.out.println("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 2、准备一个长度为10的一位数组
        int[] count = new int[10];

        // 3、拆分每个数字并统计出现的个数

        int temp = num;
        while (temp > 0) {
            count[temp % 10] += 1;
            temp = temp / 10;
        }
        // 4、打印最终的统计次数

        System.out.println(Arrays.toString(count));
    }
}
