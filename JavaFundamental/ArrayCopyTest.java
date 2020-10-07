package JavaFundamental;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] array = { 11, 22, 33, 44, 55 };
        System.out.println(Arrays.toString(array));

        int[] arrayB = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayB));

        int[] arrayC = new int[5];
        System.arraycopy(array, 0, arrayC, 0, array.length);
        System.out.println(Arrays.toString(arrayC));
    }
}
