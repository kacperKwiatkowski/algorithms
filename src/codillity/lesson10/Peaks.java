package codillity.lesson10;

import java.util.Stack;

public class Peaks {
    public static void main(String[] args){
        System.out.println(solution(new int []{1,2,3,4,3,4,1,2,3,4,6,2}));
        System.out.println(solution(new int []{1,2,3,4,3,4,1,2,3,4,6,2,1,6,2,3}));
        System.out.println(solution(new int []{1,2,3,4,3,4,1}));
        System.out.println(solution(new int []{1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,2,1}));
        System.out.println(solution(new int []{1,2,1,2,1,2,1,2}));
        System.out.println(solution(new int []{1,2,1,2,1,2,1,2,1}));
        System.out.println(solution(new int []{2,1,2,1,2,1,2,1,2}));
        System.out.println(solution(new int []{2,1,2,1,1,1,2,1,2}));

    }

    public static int solution(int [] A) {

        Stack<Integer> stack = new Stack<>();

        // Return 0 if not array not long enough
        if(A.length<3) return 0;
        int sumOfPeaks = 0;

        // Collect peaks indexes
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] & A[i] > A[i + 1]) {
                sumOfPeaks++;
                stack.add(i);
            }
        }

        // Return 0 if peaks not found
        if(sumOfPeaks==0){
            return 0;
        }

        Stack<Integer> blocks = (Stack<Integer>) stack.clone();
        int L = A.length;

        for(int i = 2; i <= A.length/2; i++){
            if((A.length)%i==0){
                while(!blocks.isEmpty()){
                    if (blocks.peek()>=L-i){
                        while(!blocks.isEmpty() && blocks.peek()>=L-i){
                            blocks.pop();
                        }
                        L-=i;
                    } else {
                        break;
                    }
                }

                if(blocks.isEmpty()){
                    return A.length/i;
                } else {
                    blocks = (Stack<Integer>) stack.clone();
                    L = A.length;
                }
            }
        }

        return 1;
    }
}
