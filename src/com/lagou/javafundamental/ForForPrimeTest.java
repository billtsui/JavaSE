package com.lagou.javafundamental;

/**
 * 打印2~100之间的所有素数
 */
public class ForForPrimeTest {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            // 判断是否为素数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
