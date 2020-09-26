package JavaFundamental;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("请输入您的考试分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        switch (score / 10) {
            case 10:
            case 9: {
                System.out.println("等级A");
            }
                break;
            case 8: {
                System.out.println("等级B");
            }
                break;
            case 7: {
                System.out.println("等级C");
            }
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0: {
                System.out.println("等级D");
            }
                break;

            default:
                break;
        }
    }
}
