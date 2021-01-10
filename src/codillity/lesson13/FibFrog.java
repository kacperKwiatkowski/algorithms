package codillity.lesson13;

import java.util.LinkedList;
import java.util.List;

public class FibFrog {
    public static void main(String[] args){

        int [] A = new int[]{0,0,0,1,1,0,1,0,0,0,0};
        System.out.println(solution(A));

    }

    public static int solution(int [] A){

        int lengthOfRiver = A.length + 1;
        int numOfJumps = 0;

        boolean isRiverCrossed = false;

        List<Integer> leaves = new LinkedList<>();

        if(isFibNum(lengthOfRiver)) return 1;

        int distance = 1;
        for(int i = 0; i<A.length; i++){
            if(A[i]==1){
                leaves.add(distance);
                distance=1;
            } else {
                distance++;
            }
        }
        leaves.add(distance);

        if (isRiverCrossed) return numOfJumps;riverCrossed
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
