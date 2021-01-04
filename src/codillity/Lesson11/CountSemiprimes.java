package codillity.Lesson11;

import utils.Printer;

import java.util.*;

public class CountSemiprimes {

    public static void main(String[] args) {

        Printer.printArray(solution(26, new int[]{1, 4, 16}, new int[]{26, 10, 20}));

    }

    public static int[] solution(int N, int[] P, int[] Q) {

        int[] result = new int[P.length];

        Set<Integer> primeNums = new HashSet<>();

        for (int j = 2; j <= N / 2; j++) {
            if (isPrime(j)) {
                primeNums.add(j);
            }
        }
        for (int i = 0; i < P.length; i++) {
            int subprimeNumsCounter = 0;
            for (int j = P[i]; j <= Q[i]; j++) {
                if (j % 2 == 0) {
                    if (primeNums.contains(j / 2)) {
                        subprimeNumsCounter++;
                    }
                } else {
                    double sr = Math.sqrt(j);
                    if ((int) j%Math.sqrt(j)==0 & primeNums.contains((int) Math.sqrt(j))) {
                        subprimeNumsCounter++;
                    } else if ((double) j / 3 == j / 3 && primeNums.contains(j / 3)) {
                        subprimeNumsCounter++;
                    }
                }
            }
            result[i] = subprimeNumsCounter;
        }
        return result;
    }

    private static boolean isPrime(int checkIfPrime) {
        if (checkIfPrime == 2)
            return true;
        else if (checkIfPrime % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(checkIfPrime); i += 2) {
            if (checkIfPrime % i == 0)
                return false;
        }
        return true;
    }

}
