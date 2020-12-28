package codillity.lesson8;

import java.util.Arrays;

public class EquiLeader {
    public static void main(String[] args){
        System.out.println(solution(new int []{4,3,4,4,4,2}));

    }

    public static int solution(int [] A){

        int equiLeaderCounter = 0;
        int leader = findDominator(A.clone());

        // Make prefix num array
        int [] prefixNums = makePrefixNumsArray(A, leader);

        //
        for(int j = 0; j < prefixNums.length - 1; j++){

            int aa = (j + 1) / 2;
            int bb = (prefixNums.length - (j+1)) / 2;
            boolean a = prefixNums[j] > aa,
                    b = prefixNums[prefixNums.length-1] - prefixNums[j] > bb;

            if(a & b){
                equiLeaderCounter++;
            }
        }

        return equiLeaderCounter;
    }

    private static int[] makePrefixNumsArray(int[] A, int leader) {
        int [] prefixNums = new int [A.length];
        int currentCount = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == leader){
                currentCount += 1;
            }
            prefixNums[i] = currentCount;
        }
        return prefixNums;
    }

    private static int findDominator(int[] A) {

        Arrays.sort(A);

        //Odd length array problem solution
        int desiredMidPoint = A.length/2;
        if(A.length%2!=0){
            desiredMidPoint += 1;
        }

        //Check for the dominant number, and its length
        for(int i = 0; i < desiredMidPoint; i++){

            if(A[i] == A[i+ A.length / 2]){
                return A[i];
            }
        }

        return -1;
    }
}
