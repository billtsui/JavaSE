package JavaOO;

/**
 * 编程实现累乘积的计算并打印
 */
public class JieChengTest {

    // 自定义成员方法实现将参数n的阶乘计算出来

    // 递推实现
    public int show(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        return sum;
    }

    // 递归实现
    public int show1(int n) {
        int sum = 1;
        if (n != 1) {
            sum = n * show1(n - 1);
        } else {
            return 1;
        }

        return sum;
    }

    public static void main(String[] args) {

        JieChengTest jieChengTest = new JieChengTest();

        int result = jieChengTest.show(5);

        System.out.println("最终的计算结果是：" + result);

        int result1 = jieChengTest.show1(3);

        System.out.println("递归的计算结果是：" + result1);
    }
}
