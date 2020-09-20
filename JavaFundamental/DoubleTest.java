package JavaFundamental;

public class DoubleTest {
    public static void main(String[] args) {
        float f1 = 3.1415926897f;
        System.out.println("f1=" + f1); // 这里不会打印出来3.1415926897,因为float的有效位数是7位

        double d1 = 3.1415926897;
        System.out.println("d1=" + d1); // 这里就可以一模一样的打印，因为double有效位数为15位

        System.out.println(0.1 + 0.2); //0.30000000000000004 有一个误差，若希望实现精确运算，则借助java.math.BigDecimal类型
    }
}
