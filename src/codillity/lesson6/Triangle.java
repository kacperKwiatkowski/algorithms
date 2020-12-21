package codillity.lesson6;

import java.util.Arrays;

public class Triangle {

    // 0 ≤ P < Q < R < N
    // A[P] + A[Q] > A[R],
    // A[Q] + A[R] > A[P],
    // A[R] + A[P] > A[Q].


    public static void main(String[] args){

        System.out.println(solution(new int [] {10, 2, 5, 1, 8, 20}));
        System.out.println(solution(new int [] {10, 50, 5, 1}));
        System.out.println(solution(new int [] {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE}));

    }

    public static int solution(int [] A){

        Arrays.sort(A);

        for(int i = A.length-1; i >= 2; i--){

            long R = A[i];
            long Q = A[i-1];
            long P = A[i-2];

            if(R < Q + P) {
                return 1;
            }
        }

        return 0;
    }
}
