package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 12:13
 */
public class ShapeRectTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setY(1);
        shape.setX(2);
        shape.show();
        Shape.test();

        //cmd+d复制当前行
        //option+shift+光标上下键，移动当前行
        System.out.println("-----------------------------");
        Rect rect = new Rect(1, 2, 3, 4);
        //当子类没有override父类方法的时候，只能调用父类的方法
        rect.show();

        System.out.println("-----------------------------");
        Shape shape1 = new Rect(7, 8, 9, 10);
        //当子类没有override父类方法的时候，只能调用父类的方法
        shape1.show();

        //父类类型的引用可以直接调用父类独有的方法
        int x = shape1.getX();
        System.out.println("获取到的横坐标是：" + x);

        //父类调用子类的方法
        int ib = ((Rect) shape1).getLength();

        System.out.println("获取到的长度是：" + ib);

        //引用类型强制转换之前，都需要用instanceof进行判断
        //判断shape引用的堆区对象是否为Circle类型，是返回true，否则返回false
        if(shape1 instanceof Circle){
            System.out.println("可以放心的转换了");
        }else{
            System.out.println("强转有风险，操作需谨慎");
        }
    }
}
