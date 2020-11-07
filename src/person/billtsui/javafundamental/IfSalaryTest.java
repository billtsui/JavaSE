package person.billtsui.javafundamental;

import java.util.Scanner;

/**
 * 计算个人所得税
 */
public class IfSalaryTest {
    public static void main(String[] args) {
        System.out.println("请输入您的薪水：");
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        sc.close();
        
        double salaryPrice = 0.0;
        if (salary <= 5000) {
            System.out.println("无需纳税");
        } else if (salary <= 8000) {
            salaryPrice = (salary - 5000) * 0.03;
        } else if (salary <= 17000) {
            salaryPrice = (salary - 8000) * 0.1 + (8000 - 5000) * 0.03;
        } else if (salary <= 30000) {
            salaryPrice = (salary - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
        }

        System.out.println("最终的个人所得税是：" + salaryPrice);
    }
}
