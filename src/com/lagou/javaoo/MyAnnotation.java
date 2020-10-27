package com.lagou.javaoo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Bill Tsui
 * @date 2020/10/27 21:23
 * 注解的使用
 * 若一个注解中没有任何的成员，则这样的注解叫做标记注解
 */

//元注解 生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //声明一个String类型的成员变量，名字为value
    public String value() default "默认值";

    public String desc();
}
