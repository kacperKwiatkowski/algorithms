package codillity.lesson4;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {


        int[] A = {0, 1, 3, 6, 4, 1, 2};

        int[] B = new int[200];
        for (int j = 0; j < B.length; j++) {
            if (j >= 101) {
                B[j] = j + 1;
            } else {
                B[j] = j;
            }
        }
        int[] C = {-2, -1, 0, 1, 2, 3, 4, 5, 7, 8};
        int[] D = {0, 3, 4, 5, 7, 8};
        int[] E = {-10, 0, 10};

        printArray(A);
        printArray(B);
        printArray(C);
        printArray(D);
        printArray(E);


        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));


    }

    static int solution(int[] A) {

        Arrays.sort(A);
        int indexOfFirstPositive = 0;

        //check if not empty or only non positive
        if (A.length == 0 || A[A.length - 1] < 1) {
            return 1;
        }

        //check if first not two
        if (A[0] >= 2) {
            return 1;
        }

        //find first positive
        for (int j = 0; j < A.length - 1; j++){
            if(A[j]>0){
                indexOfFirstPositive=j;
                break;
            }
        }

        //check if first not one
        if(A[indexOfFirstPositive]!=1){
            return 1;
        }

        //find next lowest missing
        for (int k = indexOfFirstPositive; k < A.length - 1; k++) {

            if (A[k] < 0 | A[k] == A[k + 1]) {
                continue;
            } else if (A[k] + 1 != A[k + 1]) {
                return A[k] + 1;
            }
        }

        return A[A.length - 1] + 1;
    }

    static void printArray(int[] toPrint) {
        for (int i : toPrint) {
            System.out.print(i + ": ");
        }
        System.out.println();

    }
}
