package codillity.lesson6;

import java.util.Arrays;

public class MaxProductOfThree{
        public static void main(String[] args){
            System.out.println(solution(new int []{-3, 1, 2, -2, 5, 6}));
        }

        public static int solution(int [] A){

            Arrays.sort(A);

            //Calculate last three indexes
            int checkOnlyPositiveNums = A[A.length-1]*A[A.length-2]*A[A.length-3];

            //Calculate first two index plus the last one
            int checkWithPossibleTwoNegativeNums = A[0]*A[1]*A[A.length-1];

            return Math.max(checkWithPossibleTwoNegativeNums, checkOnlyPositiveNums);
        }
}
