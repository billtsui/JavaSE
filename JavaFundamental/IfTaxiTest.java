package JavaFundamental;

import java.util.Scanner;

public class IfTaxiTest {
    public static void main(String[] args) {
        // 提示用户输入公里数和等待的秒数
        System.out.println("请输入公里数和等待的秒数：");
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        int seconds = sc.nextInt();
        sc.close();

        int price = 0;
        if (km <= 3) {
            price = km * 3;
        } else if (km <= 15) {
            price = 13 + (km - 3) * 2;
        } else {
            price = 13 + (15 - 3) * 2 + (km - 15) * 3;
        }

        int secPrice = seconds / 150;

        int sumPirce = secPrice + price;
        System.out.println("本次出租车的总费用是：" + sumPirce);
    }
}
