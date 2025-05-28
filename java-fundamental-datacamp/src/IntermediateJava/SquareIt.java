package IntermediateJava;

import java.util.Arrays;

public class SquareIt {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int[] squaredArr = squareArray(arr);

        System.out.print(Arrays.toString(squaredArr));
    }

    static int[] squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
}
