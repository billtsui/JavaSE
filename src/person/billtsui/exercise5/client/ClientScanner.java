package person.billtsui.exercise5.client;

import java.util.Scanner;

/**
 * 实现扫描器工具类的封装，可以在任何位置使用
 */
public class ClientScanner {
    private static Scanner sc = new Scanner(System.in);

    /**
     * 自定义成员方法实现扫描器的获取
     * @return
     */
    public static Scanner getSc() {

        return sc;
    }

    /**
     * 自定义成员方法实现扫描器的关闭
     */
    public static void closeScanner() {
        sc.close();
    }
}
