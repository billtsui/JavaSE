package JavaFundamental;

import java.util.Scanner;

/**
 * if语句模拟网吧上网的流程
 */
public class IfTest {
    public static void main(String[] args) {
        System.out.println("请输入您的年龄:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if(age >= 18){
            System.out.println("开心的浏览起了网页");
        }
        System.out.println("美好的时光总是短暂的！");
    }
}
