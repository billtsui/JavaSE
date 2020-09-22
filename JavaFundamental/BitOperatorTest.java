package JavaFundamental;

/**
 * 左移运算符 << 右移运算符 >> 无符号右移 >>> 将数据右移，左边使用0补充
 */
public class BitOperatorTest {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a >> 1); // 50 右移一位相当于除以2，不能整除就去除尾数
        System.out.println(a << 1); // 100 左移一位相当于乘以2

        int b = 13;
        System.out.println(b >>> 1);
    }
}
