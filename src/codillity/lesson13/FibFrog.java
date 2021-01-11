package codillity.lesson13;

import java.util.*;

public class FibFrog {
    public static void main(String[] args){

/*        System.out.println(solution(new int[]{0,0,0,1,1,0,1,0,0,0,0}));
        System.out.println(solution(new int[]{0,0,0,0,0,0,0}));
        System.out.println(solution(new int[]{0,0,0,0,0,1,0,0,0}));*/
        //System.out.println(solution(new int[]{1,1,1,0,1,0,0}));

        System.out.println(solution(new int[]{0,1,0,1,0,1,0,1,0,0,0,0,0,0,0}));
        System.out.println(solution(new int[]{0,1,0,1,0,0,0,0}));
        System.out.println(solution(new int[]{0,0,0,1,1,0,1,0,0,0,0}));

    }

    public static int solution(int [] A){

        int distance = 0;

        Queue<Integer> leaves = new LinkedList<>();

        if(isFibNum(A.length + 1)) return 1;

        for(int i = 0; i < A.length; i++){
            distance++;

            if(A[i]==1){
                if(isFibNum(distance)){

                    while(!leaves.isEmpty() && isFibNum(leaves.peek() + distance)){
                        leaves.add(leaves.poll() + distance);
                    }

                    if(!leaves.isEmpty() && isFibNum(i+1)){
                        leaves.clear();
                        leaves.add(i+1);
                    } else {
                        leaves.add(distance);
                        distance=0;
                    }

                }

                if(!leaves.isEmpty() && isFibNum(A.length + 1 - i - 1)) return leaves.size() + 1;


            }
        }

        return -1;
    }

    public static boolean isFibNum(int N){

        return isPerfectSquare(5*N*N+4) || isPerfectSquare(5*N*N-4);
    }

    public static boolean isPerfectSquare(int n){

        int square = (int) Math.sqrt(n);

        return (square*square == n);
    }
}
