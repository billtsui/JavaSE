package com.lagou.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/24 18:03
 */
public class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        setName(name);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("名字:" + getName() + " 颜色:" + getColor());
    }
}
