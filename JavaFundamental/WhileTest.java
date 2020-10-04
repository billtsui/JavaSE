package JavaFundamental;

public class WhileTest {
    public static void main(String[] args) {
        // 使用for循环打印1~10的所有整数
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
        }

        // 使用while循环打印1~10之间的所有整数
        int i = 1;
        while (i <= 10) {
            System.out.println("i=" + i);
            i++;
        }
    }
}
