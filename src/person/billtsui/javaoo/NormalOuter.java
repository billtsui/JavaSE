package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 21:15
 * 编程实现普通内部类的定义和使用
 */
public class NormalOuter {
    private int cnt = 1;

    public class NormalInner {
        private int ia = 2;

        public NormalInner() {
            System.out.println("普通内部类的构造方法执行到了");
        }

        public void show() {
            System.out.println("内部类中变量cnt的值为：" + cnt);
            System.out.println("ia = " + ia);
            System.out.println("cnt = " + NormalOuter.this.cnt);
        }
    }
}
