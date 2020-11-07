package person.billtsui.javafundamental;

import java.util.Random;
import java.util.Scanner;

public class GuessNumTest {
    public static void main(String[] args) {
        // 1、随机生成 1~100之间的整数并记录
        // 2、提示用户输入 1 ~ 100之间猜测的整数并使用变量记录
        // 3、使用用户输入的整数与随机数之间比较大小并给出对应的提示

        Random ra = new Random();
        int result = ra.nextInt(100) + 1;
        for (;;) {
            System.out.println("请输入1~100之间猜测的整数:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num > result) {
                System.out.println("猜大了");
            } else if (num < result) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了，结果是:" + result);
                sc.close();
                break;
            }
        }
    }
}
