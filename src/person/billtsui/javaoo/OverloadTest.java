package person.billtsui.javaoo;

public class OverloadTest {

    void show() {
        System.out.println("show()");
    }

    void show(int i) {
        System.out.println("show(" + i + ")");
    }

    void show(int i, double d) {
        System.out.println("show(" + i + "," + d + ")");
    }

    void show(int i, int j) {
        System.out.println("show(" + i + "," + j + ")");
    }

    public static void main(String[] args) {
        OverloadTest ot = new OverloadTest();
        ot.show();
        ot.show(100);
        ot.show(100,101.1);
        ot.show(100,101);
    }
}
