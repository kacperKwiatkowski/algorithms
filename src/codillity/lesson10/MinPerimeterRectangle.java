package codillity.lesson10;


import java.util.ArrayList;
import java.util.Stack;

public class MinPerimeterRectangle {
    public static void main(String[] args){
        System.out.println(solution(30));
        System.out.println(solution(81));
        System.out.println(solution(20));
        System.out.println(solution(101));

    }

    public static int solution(int N) {

        int range = (int) Math.sqrt(N);
        int minPerimeter = 2 * (1 + N);

        for(int i = range; i > 1; i--){

            if(N % i != 0){
                continue;
            }

            if(2 * (i + (N/i))<minPerimeter){
                minPerimeter = 2 * (i + (N/i));
            }
        }

        return minPerimeter;
    }
}
