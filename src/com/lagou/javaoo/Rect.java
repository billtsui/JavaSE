package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 12:06
 */
public class Rect extends Shape {
    private int length;
    private int width;

    public Rect() {
    }

    public Rect(int x, int y, int length, int width) {
        super(x, y);
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("长度不合理哟！！！");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("宽度不合理哟！！！");
        }
    }

    @Override
    public void show() {
        System.out.println("横坐标：" + getX() + ",纵坐标：" + getY() + "，长度是：" + getLength() + "，宽度是：" + getWidth());
    }


    //父类的静态方法不能被子类重写,当父类和子类有重名静态方法时，父类指向子类对象的引用，调用的是父类中的静态方法
    public static void test(){
        System.out.println("Rect类中的静态方法");
    }
}
