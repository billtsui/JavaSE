package person.billtsui.javaoo.exercise.one;

import java.util.Arrays;

/**
 * @author billtsui
 * @date 2020/10/27
 * 定义一个长度为[16][16]的整型二维数组并输入或指定所有位置的元素值，分别实现二维数组中所有行和所有列中所有元素的累加和并打印。
 *
 * 再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印。
 */
public class One {
    public static void main(String[] args) {
        int[][] array = new int[16][16];

        int a = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a;
                a++;
            }
        }

        System.out.println("该二维数组为：\n" + Arrays.deepToString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("二维数组所有元素的累加和为：" + sum);

        int left2right = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    left2right += array[i][j];
                }
            }
        }

        System.out.println("二维数组左上角到右下角累加和为：" + left2right);

        int right2left = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == 15) {
                    right2left += array[i][j];
                }
            }
        }

        System.out.println("二维数组右上角到左下角累加和为：" + right2left);

    }
}
