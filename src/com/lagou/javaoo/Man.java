package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 18:01
 */
public class Man implements Hunter {
    @Override
    public void hunt() {
        System.out.println("正在追赶一只小白兔");
    }

    @Override
    public void run() {
        System.out.println("正在玩命的奔跑");
    }

    @Override
    public void show1() {
        System.out.println("为了给你几分薄面，我决定重写一下");
    }

    public static void main(String[] args) {
        Hunter hunter = new Man();
        hunter.hunt();

        Runner runner = new Man();
        runner.run();

        Hunter.test();
    }
}
