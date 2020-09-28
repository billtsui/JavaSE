package JavaFundamental;

import java.util.Scanner;

/**
 * 当用户输入bye的时候结束聊天
 */
public class BreakTest {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("请输入要发送的内容");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            if ("bye".equals(str)) {
                System.out.println("聊天结束");
                break;
            } else {
                System.out.println("聊天内容是：" + str);
            }
        }
    }
}
