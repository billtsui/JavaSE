package person.billtsui.javafundamental;

public class ForSumTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }

        System.out.println("1+2+...+10000=" + sum);
    }
}
