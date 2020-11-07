package person.billtsui.javaapi;

/**
 * @author billtsui
 * @date 2020/10/29
 */
public class BooleanTest {
    public static void main(String[] args) {
        //装箱
        Boolean bo1 = Boolean.valueOf(true);
        System.out.println("bo1 = " + bo1);

        //自动装箱拆箱
        Boolean bo2 = false;
        boolean b2 = bo2;
        System.out.println("b2 = " + b2);

        //实现从String类型到boolean类型的转换
        Boolean b3 = Boolean.valueOf("false");
        System.out.println("b3 = " + b3);
    }
}
