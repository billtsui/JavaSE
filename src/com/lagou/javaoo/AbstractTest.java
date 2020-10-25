package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 16:27
 */
public abstract class AbstractTest {
    private int cnt;

    public AbstractTest() {
    }

    public AbstractTest(int cnt) {
        setCnt(cnt);
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    //自定义抽象方法
    public abstract void show();

    public static void main(String[] args) {
        //AbstractTest at = new AbstractTest();
        //System.out.println("at.cnt = " + at.cnt);
    }
}
