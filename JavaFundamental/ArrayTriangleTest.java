package JavaFundamental;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTriangleTest {
    public static void main(String[] args) {
        // 1、提示用户输入一个行数
        System.out.println("请输入一个行数：");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        // 2、根据用户输入的行数生成二维数组
        int[][] array = new int[row][];

        // 使用外层循环控制二维数组的行下标
        // 使用内层循环控制二维数组的列下标


        // 3、针对二维数组中的每个元素初始化
        for (int i = 0; i < array.length; i++) {
            //初始化二维数组的每一行
            array[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                // 当列下标为0或者列下标与当前行的行下标相等时，为1
                // 否则对应位置的元素就是上一行当前列与前一列元素的和
                if (0 == j || i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }
        
        // 4、打印最终生成的结果
        System.out.println(Arrays.deepToString(array));
    }
}
