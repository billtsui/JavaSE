package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 21:22
 */
public class NormalOuterTest {
    public static void main(String[] args) {
        //声明NormalOuter类中内部类的引用指向内部类的对象
        NormalOuter outer = new NormalOuter();
        NormalOuter.NormalInner normalInner = outer.new NormalInner();
        normalInner.show();
    }
}
