package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/29
 */
public class DoubleTest {
    public static void main(String[] args) {
        Double d1 = Double.valueOf("3.14");
        System.out.println("d1 = " + d1);
        System.out.println(Double.parseDouble("13.14"));
        System.out.println(d1.isNaN());
        Double d2 = Double.valueOf(0/0.0);
        System.out.println(d2.isNaN());
    }
}
