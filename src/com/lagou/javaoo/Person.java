package com.lagou.javaoo;

public class Person {
    private String name;
    private int age;
    private boolean gender;

    /*
     * 构造方法 如果不声明，编译器会有一个默认的构造方法
     */
    public Person() {
        System.out.println("Person()");
    }

    // 有参构造方法
    public Person(String name, int age) {
        System.out.println("Person(String,int)");
        setName(name);
        setAge(age);
    }

    // 可变长参数一定放最后一位，并且只能有一个变长参数
    void showArguments(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数为" + args[i]);
        }
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
            System.out.println("年龄不合理哟");
        }
    }

    public void show() {
        System.out.println("我是" + getName() + "，今年" + getAge() + "岁了！");
    }

    public void eat(String food) {
        System.out.println(food + "真好吃");
    }

    public void play(String game) {
        System.out.println(game + "真好玩");
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
