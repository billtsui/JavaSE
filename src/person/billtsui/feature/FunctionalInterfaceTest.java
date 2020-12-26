package person.billtsui.feature;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author billtsui
 * @date 2020/12/23
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我是既没有参数又没有返回值的方法");
            }
        };

        runnable.run();

        System.out.println("---------------------------------------------");

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("有参但没有返回值的方法");
                if(o instanceof  String){
                    System.out.println((String)o);
                }
            }
        };
        consumer.accept("Test");

        System.out.println("---------------------------------------------");

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "无参有返回值的方法";
            }
        };

        System.out.println(supplier.get());

        System.out.println("---------------------------------------------");

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o;
            }
        };

        System.out.println(function.apply("有参有返回值的方法"));
    }
}
