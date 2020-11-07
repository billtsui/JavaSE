package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 22:36
 */
public class AnonymousInterfaceTest {
    //假设已有下面的方法
    public static void test(AnonymousInterface ai) {
        ai.show();
    }

    public static void main(String[] args) {
        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());

        AnonymousInterface ait = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("这是一个匿名内部类");
            }
        };

        AnonymousInterfaceTest.test(new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类");
            }
        });

        //从java 8 开始提出新特性lamda表达式，可以简化上述代码

        AnonymousInterfaceTest.test(() -> {
            System.out.println("lambda表达式");
        });
    }
}
