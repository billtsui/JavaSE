package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 22:04
 * 实现静态内部类
 */
public class StaticOuter {
    private int cnt = 1;
    private static int snt = 4;

    public static class StaticInner{
        private int ia = 3;
        private static int snt = 2;
        public StaticInner(){
            System.out.println("静态内部类的构造方法");
        }

        public void show(){
            System.out.println("ia = " + ia);
            System.out.println("外部类中的snt = " + StaticOuter.snt);
            System.out.println("snt = " + StaticInner.snt);
        }
    }
}
