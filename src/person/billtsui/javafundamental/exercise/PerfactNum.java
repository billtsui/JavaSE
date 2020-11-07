package person.billtsui.javafundamental.exercise;

/**
 * 打印1000以内所有完数
 */
public class PerfactNum {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;

            for (int j = 1; j <= i - 1; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println("当前完数为:" + i);
            }
        }
    }
}