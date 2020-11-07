package person.billtsui.javafundamental;

import java.util.Scanner;

public class LogicJudgeTest {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(num + ((100 <= num && num <= 999) ? "是三位数" : "不是三位数"));
    }
}
