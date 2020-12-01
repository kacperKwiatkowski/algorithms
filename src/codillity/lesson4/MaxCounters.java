package codillity.lesson4;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args){

        int N = 5;
        int [] A = {3, 4, 4, 6, 1, 4, 4};
        int K = 0;

        int [] result = new int[N];

        for(int i = 0; i < A.length; i++){
            if(A[i] > N){
                Arrays.fill(result, K);
            } else {
                for(int j = 0; j < result.length; j++){
                    if(j+1 == A[i]){
                        result[j]+=1;
                        if(result[j] > K){
                            K++;
                        }
                    }
                }
            }
        }


        //write a method for A[K] = N + 1

    }

    static void printArray(int [] toPrint){
        for(int i : toPrint){
            System.out.print(i + ": ");
        }

    }
}
