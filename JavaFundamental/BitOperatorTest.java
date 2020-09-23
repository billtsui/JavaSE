package JavaFundamental;

/**
 * 左移运算符 << 
 * 右移运算符 >> 
 * 无符号右移 >>> 将数据右移，左边使用0补充
 * & 按位与 同真为真
 * | 按位或 有真为真
 * ^ 异或运算符 一真一假为真
 * ~ 按位取反 1变成0 0变成1
 */
public class BitOperatorTest {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a >> 1); // 50 右移一位相当于除以2，不能整除就去除尾数
        System.out.println(a << 1); // 100 左移一位相当于乘以2

        int b = 13;
        System.out.println(b >>> 1); // 对于正数，逻辑右移和右移结果一直
        int c = -12;
        System.out.println(c >>> 28);

        byte b1 = 11;
        byte b2 = 13;
        System.out.println("b1 = " + b1 );
        System.out.println("b2 = " + b2 );

        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);
        System.out.println(~b1);

    }
}
