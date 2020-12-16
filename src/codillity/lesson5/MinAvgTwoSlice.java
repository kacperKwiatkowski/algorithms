package codillity.lesson5;

import utils.Printer;

public class MinAvgTwoSlice {

    //N is between 2 and 100000
    //A[i] is between -10000 and 10000

    public static void main(String[] args){

        System.out.println(solution());


    }

    public static int solution(){
        int [] A = new int[]{4, 2, 2, 5, 1, 5, 8};
        double minAvg = Integer.MAX_VALUE;
        int minPos = 0;


        for(int i = 0; i < A.length-1; i++){
            if((A[i] + A[i+1])/2.0 < minAvg){
                minPos = i;
                minAvg = (A[i] + A[i+1])/2.0;
            }
            if(i < A.length - 2 && (A[i] + A[i+1] + A[i+2])/3.0 < minAvg){
                minPos = i;
                minAvg = (A[i] + A[i+1] + A[i+2])/3.0;
            }
        }
        return minPos;
    }



}
