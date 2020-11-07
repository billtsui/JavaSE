package person.billtsui.javaoo;

public class ThisTest {
    ThisTest() {
        System.out.println("构造方法this:" + this.hashCode());
    }

    void show() {
        System.out.println("成员方法this:" + this.hashCode());
    }

    public static void main(String[] args) {
        ThisTest tt = new ThisTest();
        System.out.println("main方法中tt:" + tt.hashCode());
        tt.show();
    }
}
