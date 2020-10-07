package JavaFundamental;

import java.util.Arrays;

/**
 * 一位数组的CRUD
 */
public class ArrayOperationTest {
    public static void main(String[] args) {
        // 1、声明一个长度为5，元素类型为int的一位数组
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (i + 1) * 11;
        }

        System.out.println(Arrays.toString(array));

        // 将55插入到下标为0的位置

        // array[4] = array[3];
        // array[3] = array[2];
        // array[2] = array[1];
        // array[1] = array[0];
        // array[0] = 55;

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = 55;

        System.out.println(Arrays.toString(array));

        // 将数据55从数组中删除，删除方式为后续元素向前移动

        // array[0] = array[1];
        // array[1] = array[2];
        // array[2] = array[3];
        // array[3] = array[4];
        // array[4] = 0;

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[4] = 0;

        System.out.println(Arrays.toString(array));

        // 找到元素22并将其改为220

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 22) {
                array[i] = 220;
                break;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
