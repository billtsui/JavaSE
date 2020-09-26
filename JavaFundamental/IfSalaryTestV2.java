package JavaFundamental;

import java.util.Scanner;

public class IfSalaryTestV2 {
    public static void main(String[] args) {
        System.out.println("请输入您的薪水：");
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        sc.close();
        
        double salaryPrice = 0.0;
        if (salary <= 5000) {
            System.out.println("无需纳税");
        } else if (salary <= 8000) {
            salaryPrice = (salary - 5000) * 0.03 - 0;
        } else if (salary <= 17000) {
            salaryPrice = (salary - 5000) * 0.1 - 210;
        } else if (salary <= 30000) {
            salaryPrice = (salary - 5000) * 0.2 - 1410 ;
        }

        System.out.println("最终的个人所得税是：" + salaryPrice);
    }
}
