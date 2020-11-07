package person.billtsui.javafundamental.exercise;

import java.util.Random;

/**
 * 双色球
 */
public class DoubleColor {
    public static void main(String[] args) {
        generateNums();
    }

    private static void generateNums() {

        Random ra = new Random();

        int[] reds = new int[6];
        int blue = ra.nextInt(16) + 1;
        boolean isRepeat = false;

        //生成红色球号码并去重
        for (int i = 0; i < 6; i++) {
            reds[i] = ra.nextInt(33) + 1;
            for (int j = 0; j < i; j++) {
                if (reds[i] == reds[j]) {
                    isRepeat = true;
                    i--;
                }
            }
        }

        System.out.println("中奖号码为:");
        for (int result : reds) {
            System.out.print(result + "|");
        }
        System.out.print(blue);
        System.out.println();
    }
}
