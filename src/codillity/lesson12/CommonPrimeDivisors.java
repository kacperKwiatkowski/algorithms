package codillity.lesson12;

import utils.Printer;

import java.util.Arrays;

public class CommonPrimeDivisors {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{15, 10, 30}, new int[]{75, 30, 5}));
        System.out.println(solution(new int[]{15, 10, 9}, new int[]{75, 30, 5}));
        System.out.println(solution(new int[]{1}, new int[]{1}));
    }

    public static int solution(int[] A, int[] B) {

        int counter = 0;
        for(int i = 0; i < A.length; i++){
            if (hasSameDivision(A[i], B[i])){
                counter++;
            }
        }
        return counter;
    }

    static boolean hasSameDivision(int A, int B){
        int eucA, eucB;
        int eucOfPair = euclidean(A, B);

        while(A!=1) {
            eucA = euclidean(A, eucOfPair);
            if (eucA == 1) break;
            A = A / eucA;
        }

        if(A!=1) return false;

        while(B!=1) {
            eucB = euclidean(B, eucOfPair);
            if (eucB == 1) break;
            B = B / eucB;
        }
        return B==1;
    }

    static int euclidean(int N, int M) {
        if(N % M == 0) return M;
        else           return euclidean(M, N % M);
    }
}
