package com.lagou.javafundamental;

public class IntTest {
    public static void main(String[] args) {
        byte b1 = 25; // byte能够存储 -128 ~ 127之间的数字
        System.out.println("b1 = " + b1);

        int i1 = 250; //如果声明成byte，编译器会报不兼容的类型，从int转换到byte可能会有损失。直接写的整形数字默认为int类型 
        System.out.println("i1 = " + 65535);

        short s1 = 250;
        System.out.println("s1 = " + s1);

        int i2 = 65535;
        System.out.println("i2 = " + i2);

        long l1 = 2502506006l; //如果不加后缀l，这里报数字太大。因为它默认为int类型
        System.out.println("l1 = " + l1);
    }
}
