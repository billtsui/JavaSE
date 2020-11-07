package person.billtsui.javafundamental;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            } else {
                System.out.println("i=" + i);
            }
        }
    }
}
