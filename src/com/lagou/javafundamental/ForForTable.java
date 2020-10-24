package com.lagou.javafundamental;

/**
 * 双层循环打印99乘法表
 */
public class ForForTable {
    //使用标号的方式跳出多层循环
    public static void main(String[] args) {
        outer:for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j+" ");
                if(6 == j){
                    break outer;
                }
            }
            System.out.println();
        }
    }
}
