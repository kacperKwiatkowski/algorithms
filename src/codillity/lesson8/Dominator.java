package codillity.lesson8;

import utils.Printer;

import java.util.Arrays;

public class Dominator {

    public static void main(String[] args){

        //System.out.println((solution(new int [] {4,3,3,2,3,-1,3,3})));
        //System.out.println((solution(new int [] {0,0,1,1,1})));
        System.out.println((solution(new int [] {})));

    }

    public static int solution(int [] A){

        //check for empty or single element array
        if( A.length == 0){
            return -1;
        } else if (A.length == 1){
            return 0;
        }

        //initiate vars
        int [] originalArray = A.clone();
        Arrays.sort(A);
        int dominator = A[0];
        boolean isDominatorExistent = false;

        //Odd length array problem solution
        int desiredMidPoint = A.length/2;
        if(A.length%2!=0){
            desiredMidPoint += 1;
        }

        //Check for the dominant number, and its length
        for(int i = 0; i < desiredMidPoint; i++){

            if(A[i] == A [i+A.length / 2]){
                dominator = A[i];
                isDominatorExistent = true;
                break;
            }
        }

        //Checks array for dominant number indexes
        if(isDominatorExistent){
            int k;
            for(k = 0; k < A.length; k++){
                if(originalArray[k]==dominator){
                    break;
                }
            }
            return k;
        } else {
            return -1;
        }
    }
}
