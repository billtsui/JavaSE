package com.lagou.javaapi;

/**
 * @author billtsui
 * @date 2020/10/29
 */
public class IntegerTest {
    public static void main(String[] args) {
        //最大值
        System.out.println(Integer.MAX_VALUE);

        //最小值
        System.out.println(Integer.MIN_VALUE);

        //二进制位数
        System.out.println(Integer.BYTES);

        //所占字节数
        System.out.println(Integer.SIZE);

        //对应int类型的class实例
        System.out.println(Integer.TYPE);

        System.out.println("--------------------");

        //采用对象的方式
        Integer integer = new Integer("888");
        System.out.println("i = " + integer.toString());

        Integer i1 = Integer.valueOf("999");
        System.out.println("i1 = " + i1);

        //自动装箱和拆箱
        Integer it2 = 100;
        int it3 = it2;

        Integer it4 = 128;
        Integer it5 = 128;

        //-128 ~ 127的数值，会保存在常量池中，引用相同
        Integer it6 = 127;
        Integer it7 = 127;

        System.out.println(it4 == it5); //false
        System.out.println(it4.equals(it5)); //true

        System.out.println(it6 == it7); //true
        System.out.println(it6.equals(it7));//true

        System.out.println("--------------------------");
        int i = Integer.parseInt("2000");
        System.out.println(Integer.toString(999));
        System.out.println(Integer.toHexString(200));
        System.out.println(Integer.toBinaryString(200));
        System.out.println(Integer.toOctalString(200));
    }
}
