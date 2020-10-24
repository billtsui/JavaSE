package com.lagou.javaoo;

public class StaticBlock {
    //当需要在构造方法之前执行一些准备工作时，则讲准备工作的相关代码写在构造块中
    //比如：对成员变量进行的统一初始化操作

    //构造块在每一个对象创建之前，都会执行
    {
        System.out.println("构造块");
    }

    public StaticBlock(){
        System.out.println("构造方法体");
    }

    {
        System.out.println("构造块2");
    }

    //静态代码块
    //会在类加载的时候执行
    //静态代码块只会执行一次，因为类加载一次
    //随着类的加载做一些准备工作室，则编写代码到静态代码块中，比如：加载数据库的驱动包等
    static {
        System.out.println("静态代码块");
    }
}
