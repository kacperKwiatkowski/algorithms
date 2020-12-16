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

        double currentMin = A.length;
        double calculatedSlice = 0;
        double currentSum = 0;
        int minPos = 0;

        for(int i = 0; i < A.length; i++){

            currentSum = A[i];

            for(int j = i+1; j < A.length; j++){
                currentSum += A[j];
                calculatedSlice = currentSum / (j - i + 1);

                if(currentMin > calculatedSlice){
                    currentMin = calculatedSlice;
                    minPos = i;
                }

            }
        }

        return minPos;
    }



}
