package JavaFundamental;

import java.util.Arrays;

public class ArrayArrayTest {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array[i], 5);
        }

        System.out.println(Arrays.deepToString(array));
    }
}
