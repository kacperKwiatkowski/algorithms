package codillity.lesson6;

import utils.Printer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 3, 2, 4, 2, 2}));

    }

    public static int solution(int[] A) {

        int distinctValuesCounter = 0;

        Arrays.sort(A);

        //empty array
        if(A.length==0){
            return distinctValuesCounter;
        } else {
            distinctValuesCounter++;
        }

        //one element array
        if(A.length==1){
            return 1;
        }

        //two element array
        if(A.length==2){
            if(A[0]==A[1]){
                return 1;
            } else {
                return 2;
            }
        }


        //check middle indexes
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] != A[i + 1]) {
                distinctValuesCounter++;
            }
        }

        //check last index
        if(A[A.length - 2] != A[A.length-1]){
            distinctValuesCounter++;
        }

        return distinctValuesCounter;
    }
}
