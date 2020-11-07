package person.billtsui.javafundamental;


/**
 * 自动类型转换
 * byte(1 byte) --> short/char(2 bytes) --> int(4 bytes) --> long(8 bytes) --> float(4 bytes) --> double(8 bytes)
 */
public class TypeTransformTest {
    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = 20;
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);

        //自动类型转换 从byte 转到了 short
        s1 = b1;
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);

        //强制类型转换
        s1 = 100;
        b1 = (byte)s1;
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);

        float f1 = 5.14f;

        //这里强制转换后，省略了小数部分，打印5
        b1 = (byte)f1;
        System.out.println("b1 = " + b1);
    

    }
    
}
