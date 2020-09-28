package JavaFundamental.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组扩容
 */
public class ResetCapacity {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        int size = 0;
        for (;;) {
            System.out.println("请输入一个数字添加到数组内");
            int num = sc.nextInt();
            array[size] = num;
            if (size >= (array.length - 1) * 0.8) {
                int[] newArray = new int[(int) (array.length * 1.5)];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
            size++;
            System.out.println("数组长度:" + array.length);
            System.out.println("元素数量:" + size);
            System.out.println("数组内容:" + Arrays.toString(array));
        }
    }

}
