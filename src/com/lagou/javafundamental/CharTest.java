package com.lagou.javafundamental;

public class CharTest {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println("c1 = " + c1);
        System.out.println("对应的编号是:" + (int)c1);

        char c2 = 98;
        System.out.println("c2 = " + c2);
        System.out.println("对应的编号是:" + (int)c2);

        //这里要用转义字符断句
        System.out.println("我想过过\"过过过过的生活");

        //打印反斜杠自己
        System.out.println("\\");
        
        //打印制表符
        System.out.println("\t");

        //换行
        System.out.println("\n");
    }
}
