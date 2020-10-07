package JavaFundamental;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScoreTest {
    public static void main(String[] args) {
        // 1、提示用户输入学生的人数并记录
        System.out.println("请输入学生的人数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 2、根据学生人数来声明一位数组

        int[] scores = new int[num];

        // 3、提示用户输入每个学生的考试成绩
        System.out.println("请输入每个学生的考试成绩：");
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的考试成绩");
            scores[i] = sc.nextInt();
        }

        // 4、打印所有学生的考试成绩
        System.out.println(Arrays.toString(scores));

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("该班总成绩为：" + sum);
        System.out.println("该班平均成绩为：" + sum * 1.0 / scores.length);
    }
}
