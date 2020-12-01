package codillity.lesson4;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args){

        int [] A = {1, 4, 3};
        int [] B = {1};
        int [] C = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};

        solution(A);
        System.out.println(solution(A));

        solution(B);
        System.out.println(solution(B));

        solution(C);
        System.out.println(solution(C));


    }

    static int solution(int [] A){
        Arrays.sort(A);

        //checks if last index corresponds to N
        if(A.length!=A[A.length-1]){
            return 0;
        } else {
            //checks if is a sequence
            for(int i = 0; i < A.length-1; i++){
                if(A[i] == A[i+1]){
                    return 0;
                }
            }
            return 1;
        }
    }

    static void printArray(int[] toPrint) {
        for (int i : toPrint) {
            System.out.print(i + ": ");
        }
        System.out.println();

    }
}
