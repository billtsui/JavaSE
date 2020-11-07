package person.billtsui.javafundamental.exercise;

/**
 * 五子棋盘绘制
 */
public class DrawFive {
    public static void main(String[] args) {
        //ascii码
        int[] arr = { 0, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // 第一行打印数组顺序内容
                if (0 == i) {
                    char num = (char) arr[j];
                    System.out.print(num + " ");
                    // 第一列打印数组顺序内容
                } else if (0 == j) {
                    char num = (char) arr[i];
                    System.out.print(num + " ");
                } else {
                    System.out.print("+" + " ");
                }
            }
            System.out.println();

        }
    }
}
