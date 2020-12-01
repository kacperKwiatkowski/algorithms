package codillity.lesson4;

import java.util.Arrays;

public class MaxCounters2 {
    public static void main(String[] args) {
        //FIXME 77%

        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int K = 0;
        int L = 0;

        int[] result = new int[N];

        for (int i : A) {

            if (i < N) {
                result[i - 1]++;
                if (result[i - 1] > K) {
                    K++;
                }
            } else {
                L=+K;
                K=0;
                result = new int[N];
            }
        }

        for(int k = 0; k < result.length; k++){
                result[k]+=L;
        }

        printArray(result);



/*else {
            for(int j = 0; j < result.length; j++){
                if(j+1 == A[i]){
                    result[j]+=1;
                    if(result[j] > K){
                        K++;
                    }
                }
            }
        }*/

    }

    static void printArray(int[] toPrint) {
        for (int i : toPrint) {
            System.out.print(i + ": ");
        }
        System.out.println();

    }
}
