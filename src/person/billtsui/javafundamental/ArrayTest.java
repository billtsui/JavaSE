package person.billtsui.javafundamental;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 1、声明一个长度为2，元素类型为int的一位数组
        int[] array = new int[2];
        array[0] = 1;
        array[1] = 3;
        System.out.println(Arrays.toString(array));
        System.out.println("数组的长度为:" + array.length);
    }
}
