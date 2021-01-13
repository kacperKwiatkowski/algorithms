package codillity.lesson13;

import utils.Printer;

import java.util.Arrays;

public class Ladder {

    static int numOfOccurrences = 0;

    public static void main(String[] args) {

        Printer.printArray(solution(new int[]{4, 4, 5, 5, 1}, new int[]{3, 2, 4, 3, 1}));
        Printer.printArray(solution(new int[]{1}, new int[]{1}));

    }

    public static int[] solution(int[] A, int[] B) {

        int maxFib = 0;
        for (int i = 0; i < A.length; i++) {
            maxFib = Math.max(A[i], maxFib);
        }

        int[] fibNums = new int[maxFib + 1];
        fibNums[0] = 1;
        fibNums[1] = 1;
        if (maxFib > 2) {
            for (int i = 2; i < fibNums.length; i++) {
                fibNums[i] = (fibNums[i - 1] + fibNums[i - 2]) % (1 << 30);
            }
        }

        int[] result = new int[B.length];

        for (int i = 0; i < B.length; i++) {

            if (A[i] != 1) {
                result[i] = (fibNums[A[i]]) % (1 << B[i]);
            } else {
                result[i] = 1;
            }
        }

        return result;
    }
}
