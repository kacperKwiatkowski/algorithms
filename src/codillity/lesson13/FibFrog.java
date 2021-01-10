package codillity.lesson13;

import java.util.LinkedList;
import java.util.List;

public class FibFrog {
    public static void main(String[] args){

        System.out.println(solution(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
        System.out.println(solution(new int[]{0,0,0,0,0,0,0}));
        System.out.println(solution(new int[]{1,1,1,1,1,1,1}));

    }

    public static int solution(int [] A){

        int numOfJumps = 0;
        int distance = 1;
        int previousJumpDistance = 0;

        for(int i = 0; i<A.length; i++){
            if(A[i]==1){
                if(isFibNum(distance)){
                    distance=1;
                    numOfJumps++;
                    continue;
                }
            }
                distance++;
        }

        if (isFibNum(distance)) return ++numOfJumps;
        else return -1;
    }

    public static boolean isFibNum(int N){

        return isPerfectSquare(5*N*N+4) || isPerfectSquare(5*N*N-4);
    }

    public static boolean isPerfectSquare(int n){

        int square = (int) Math.sqrt(n);

        return (square*square == n);
    }
}
