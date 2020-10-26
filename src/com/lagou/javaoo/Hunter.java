package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 18:00
 * <p>
 * 接口只能继承接口不能继承类
 */
public interface Hunter extends Runner {

    //自定义成员方法秒数捕猎的行为
    public abstract void hunt();

    /**
     * java 8 之后可以在接口定义非抽象方法，但是需要加default关键字
     */
    public default void show1() {
        System.out.println("这里仅仅是接口里的默认实现，继承类可以自由选择是否重写");
    }

    //静态方法，隶属于接口层级
    public static void test(){
        System.out.println("这里是静态方法，可以直接通过接口名.的方式调用");
    }

    public default void base(){
        System.out.println("1.9以后接口可以有private方法");
    }
}
