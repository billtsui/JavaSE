package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 15:49
 */
public class Circle extends Shape {
    private int ir;

    public Circle() {
    }

    public Circle(int x, int y, int ir) {
        super(x, y);
        this.ir = ir;
    }

    public int getIr() {
        return ir;
    }

    public void setIr(int ir) {
        if (ir > 0) {
            this.ir = ir;
        } else {
            System.out.println("半径不合理哟！！！");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("半径是" + getIr());
    }
}
