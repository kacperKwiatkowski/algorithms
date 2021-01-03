package codillity.lesson10;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Flags {
    public static void main(String[] args){
        System.out.println(solution(new int []{1,5,3,4,3,4,1,2,3,4,6,2}));
        System.out.println(solution(new int []{1,5,3,4,3,4,1,2,3,4,6,21,5,3,4,3,4,1,2,3,4,6,21,5,3,4,3,4,1,2,3,4,6,2}));
        System.out.println(solution(new int []{1,2,1}));
        System.out.println(solution(new int []{1,2,1,2,1,2,1,2,1,2,1,2,1,2,1}));
        System.out.println(solution(new int []{7, 10, 4, 5, 7, 4, 6, 1, 4, 3, 3, 7}));
        System.out.println(solution(new int []{9, 9, 4, 3, 5, 4, 5, 2, 8, 9, 3, 1}));

    }

    public static int solution(int [] A) {

        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> list = new ArrayList<>();

        if(A.length<3) return 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] & A[i] > A[i + 1]) {
                stack.add(i);
                list.add(i);
                i++;
            }
        }

        System.out.println(stack);

        int K = list.size();


        int maxNumOfFlags = 0;
        if(!list.isEmpty()){

            int currentFlag = list.get(0);
            maxNumOfFlags++;

            for(int i = 0; i < list.size(); i++){
                if(list.get(i) >= K + currentFlag){
                    maxNumOfFlags++;
                    currentFlag = list.get(i);
                }
            }
        }





/*        while (!stack.isEmpty()){
            currentFlag = stack.pop();

            while (!stack.isEmpty() && stack.peek() > currentFlag  - K){
                stack.pop();
            }

            maxNumOfFlags++;
        }*/

        return maxNumOfFlags;
    }
}
