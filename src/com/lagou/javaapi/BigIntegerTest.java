package com.lagou.javaapi;

import java.math.BigInteger;

/**
 * @author billtsui
 * @date 2020/10/30
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        //1、构造两个BigInteger类型的对象
        BigInteger b1 = new BigInteger("20");
        BigInteger b2 = new BigInteger("8");

        System.out.println("实现加法运算的结果是：" + b1.add(b2));
        System.out.println("实现减法运算的结果是：" + b1.subtract(b2));
        System.out.println("实现乘法运算的结果是：" + b1.multiply(b2));
        System.out.println("实现除法运算的结果是：" + b1.divide(b2));
        System.out.println("实现取余运算的结果是：" + b1.remainder(b2));

        System.out.println("---------------------------------------");
        //一次性得到商和余数
        BigInteger[] result = b1.divideAndRemainder(b2);
        System.out.println("商是：" + result[0]);
        System.out.println("余数是：" + result[1]);
    }
}
