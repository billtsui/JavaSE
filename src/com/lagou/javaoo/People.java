package com.lagou.javaoo;

/**
 * People类的封装
 */
public class People {
    private String name;
    private int age;
    private String country;

    // static 修饰的成员变量 隶属于类层级，整个类只有一份，被所有对象共享
    private static String cnCountry = "China";

    public People() {}

    public People(String name, String country, int age) {
        setName(name);
        setAge(age);
        setCountry(country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("年龄不合理");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void show() {
        System.out.println("我是" + getName() + "，今年" + getAge() + "岁了。来自" + getCountry() + "，国名叫" + People.cnCountry);
    }

}
