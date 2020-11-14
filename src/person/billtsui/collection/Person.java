package person.billtsui.collection;

import java.util.Arrays;

/**
 * 自定义泛型类Person，其中T相当于形式参数负责占位，具体数值由实参决定
 *
 * @param <T> 看过是一种名字为T的数据类型即可
 * @author billtsui
 * @date 2020/11/14
 */
public class Person<T> {
    private String name;
    private int age;
    private T gender;

    public Person() {
    }

    public Person(String name, int age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
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
        this.age = age;
    }

    //自定义方法实现将参数指定数组中的所有元素打印出来
    public <T1> void printArray(T1[] array) {
        for (T1 t : array) {
            System.out.println("tt=" + t);
        }
    }

}
