package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 17:39
 */
public interface InterfaceTest {
    //接口不能被实例化，比抽象类更抽象，所以只能有常量
    int CNT = 1;

    /**
     * 从 java 9 开始，允许接口有私有方法
     */
    private void show(){}

    /**
     * 接口中的非私有方法都是抽象的
     */
    public abstract void show1();
}
