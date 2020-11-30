package codillity.lesson2;

import java.util.Arrays;

public class OddOccurrenceArray2 {

    public static void main(String[] args) {

        System.out.println(foundValue());

    }

    static int foundValue() {
        int[] A = {7, 9, 7};
        int result = 0;
        Arrays.sort(A);


        for (int i = 0; i < A.length; i = i + 2) {
            if (i == A.length - 1) {
                return A[A.length - 1];
            } else if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return 0;
    }
}
