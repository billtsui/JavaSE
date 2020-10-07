package JavaFundamental;

import java.util.Scanner;

/**
 * 使用while循环实现任意正整数的逆序输出
 */
public class WhileReverseTest {
    public static void main(String[] args) {
        // 1、提示用户输入一个正整数
        System.out.println("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = 0;
        int temp = num;
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp /= 10;// 丢弃个位数
        }
        System.out.println(num + "逆序后的结果是" + res);
    }
}
