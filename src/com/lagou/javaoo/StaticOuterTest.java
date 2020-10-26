package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 22:11
 */
public class StaticOuterTest {
    public static void main(String[] args) {
        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        staticInner.show();
    }
}
