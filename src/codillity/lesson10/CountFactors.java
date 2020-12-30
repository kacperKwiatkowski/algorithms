package codillity.lesson10;


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CountFactors {
    public static void main(String[] args){
        System.out.println(solution(24));

    }

    public static int solution(int N){

        int sqrRoot = (int) Math.sqrt(N);
        int divisors = 0;

        for(int i = 1; i <= sqrRoot; i++){
            if(N % i == 0){
                divisors+=2;
            }
        }

        if(sqrRoot * sqrRoot == N){
            divisors--;
        }

        return divisors;
    }
}
