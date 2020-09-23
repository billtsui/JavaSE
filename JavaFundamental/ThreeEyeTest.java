package JavaFundamental;

import java.util.Scanner;

public class ThreeEyeTest {
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner sc = new Scanner(System.in);
        int ia = sc.nextInt();
        int ib = sc.nextInt();
        sc.close();
        int max = ia > ib ? ia : ib;
        System.out.println("最大值是:" + max);
    }
}
