package person.billtsui.javaapi;

/**
 * @author billtsui
 * @date 2020/10/30
 * Math类常用方法
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println("获取两个数中的最大值：" + Math.max(10, 11));
        System.out.println("获取两个数中的最小值：" + Math.max(10, 11));
        System.out.println("获取次方的结果是：" + Math.pow(2, 3));
        System.out.println("获取绝对值：" + Math.abs(-19));
        System.out.println("进行四舍五入的结果是：" + Math.round(3.14));
        System.out.println("获取某数的平方根：" + Math.sqrt(16));
        System.out.println("生成的随机数是：" + Math.random());
    }
}
