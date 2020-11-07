package person.billtsui.javaapi;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author billtsui
 * @date 2020/10/30
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        //构造两个BigDecimal类型的对象
        BigDecimal bd1 = new BigDecimal("5.2");
        BigDecimal bd2 = new BigDecimal("1.3");

        System.out.println("加法运算结果：" + bd1.add(bd2));
        System.out.println("减法运算结果：" + bd1.subtract(bd2));
        System.out.println("乘法运算结果：" + bd1.multiply(bd2));
        System.out.println("除法运算结果：" + bd1.divide(bd2));

        //实现精确运算
        System.out.println(0.1 + 0.2);
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        System.out.println("精确计算的结果是：" + bd3.add(bd4));

        //注意事项
        BigDecimal bd5 = new BigDecimal("2");
        BigDecimal bd6 = new BigDecimal("0.3");

        //这里会报异常，除不尽，应该带上舍入模式
        System.out.println("除法运算结果是：" + bd5.divide(bd6, RoundingMode.FLOOR));
    }
}
