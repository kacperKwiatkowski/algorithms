package codillity.lesson7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fish {

    public static void main(String[] args){

        System.out.println(solution(new int[]{4,3,2,1,5}, new int []{0,1,0,0,0}));

    }

    public static int solution(int [] A, int [] B){

        Stack<Integer> fishAlive = new Stack<>();

        int sumOfSurvivingFish = 0;
        int i = 0;
        while(i < A.length){

            // adds first fish swimming downstream
            if(B[i]==0 & fishAlive.size()==0){
                sumOfSurvivingFish++;
            } else if(B[i]==0) {

                // resolves fish encounters
                while (!fishAlive.isEmpty()){
                    if(A[fishAlive.peek()]<A[i]){
                        fishAlive.pop();
                    } else {
                        break;
                    }
                }

                if(fishAlive.isEmpty()){
                    sumOfSurvivingFish++;
                }

            } else {
                fishAlive.add(i);
            }

            i++;

        }


        return sumOfSurvivingFish + fishAlive.size();
    }
}
