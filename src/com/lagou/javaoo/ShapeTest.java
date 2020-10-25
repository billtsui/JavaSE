package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 15:55
 */
public class ShapeTest {

    //自定义成员方法将参数指定的矩形对象特征打印出来
//    public static void draw(Rect r){
//        r.show();
//    }
//
//    public static void draw(Circle c){
//        c.show();
//    }

    //实现既能打印Rect对象，又能打印Circle对象特征，对象由参数传入
    public static void draw(Shape s){
        s.show();
    }
    public static void main(String[] args) {
        ShapeTest.draw(new Rect(1,2,3,4));
        ShapeTest.draw(new Circle(5,6,7));
    }
}
