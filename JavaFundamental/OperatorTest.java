package JavaFundamental;

/**
 * Java中的运算符
 */
public class OperatorTest {
    public static void main(String[] args) {
        /**
         * 算数运算符 + - * / %
         */

        int i1 = 6;
        int i2 = 2;

        int i3 = i1 + i2;
        System.out.printf("%d+%d=%d\n", i1, i2, i3);

        int i4 = i1 - i2;
        System.out.printf("%d-%d=%d\n", i1, i2, i4);

        int i5 = i1 * i2;
        System.out.printf("%d*%d=%d\n", i1, i2, i5);

        // 当两个整数相除时，结果值保留整数部分，丢弃小数部分。
        int i6 = i1 / i2;
        System.out.printf("%d/%d=%d\n", i1, i2, i6);

        // 如果希望结果是小数，将其中一个操作数转换为浮点型即可
        System.out.println(6 / (float) 2);
        System.out.println(5 / (float) 2);

        // 更为合适的方式是将一个操作数乘以1.0
        System.out.println(5 * 1.0 / 2);

        /**
         * 关系运算符 > >= < <= == !=
         */

        /**
         * 1、声明两个int类型的变量并初始化 
         * 2、使用关系运算符比较这两个变量的关系
         */
        int ia = 10;
        int ib = 20;
        boolean result = ia > ib;
        System.out.printf("%d > %d: %b\n",ia,ib,result);

        /**
         * 自增减运算符
         * ++ --
         */

         int ic = 10;

         //先使用再自加，这里打印10
         System.out.println(ic++);

         //这里打印11
         System.out.println(ic);

         //先自增再使用，这里打印12
         System.out.println(++ic); 

    }
}
