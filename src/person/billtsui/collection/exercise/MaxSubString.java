package person.billtsui.collection.exercise;

import java.util.Scanner;

/**
 * @author billtsui
 * @date 2020/11/16
 * 编程获取两个指定字符串中的最大相同子串并打印出来。
 * <p>
 * 如： s1="asdafghjka", s2="aaasdfg" 他们的最大子串为"asd"
 * 提示： 将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * 主要是取字符串的子串
 */
public class MaxSubString {
    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();

        System.out.println("请再次输入一个字符串：");
        String str2 = scanner.next();
        scanner.close();
        System.out.println("两个字符串的最大相同子串为：" + getMaxSubString(str1, str2));

    }

    private static String getMaxSubString(String str1, String str2) {
        String min = (str1.length() > str2.length()) ? str2 : str1;
        String max = (str1.length() > str2.length()) ? str1 : str2;
        String result = null;
        for (int x = 0; x < min.length(); x++) {
            for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {
                String temp = min.substring(y, z);
                if (max.contains(temp)) {
                    return temp;
                }
            }
        }
        return null;
    }
}
