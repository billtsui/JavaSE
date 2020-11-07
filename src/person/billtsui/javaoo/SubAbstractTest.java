package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/25 16:39
 */
public class SubAbstractTest extends AbstractTest {
    @Override
    public void show() {
        System.out.println("其实我是被迫重写的，否则我也得变成抽象的呀！！！");
    }

    public static void main(String[] args) {
        SubAbstractTest sat = new SubAbstractTest();
        sat.show();

        AbstractTest at = new SubAbstractTest();
        at.show();
    }
}
