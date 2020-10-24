package com.lagou.javafundamental;

/**
 * 打印 1~100内的所有奇数
 */
public class ForNumTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("i=" + i);
            }
        }

        System.out.println("--------------------------------------------------");

        for (int i = 1; i <= 100; i += 2) {
            System.out.println("i=" + i);
        }
    }
}