package codillity.lesson7;

import java.util.Stack;

public class StoneWall {

    public static void main(String[] args){
        System.out.println(solution(new int [] {8,8,5,7,9,8,7,4,8}));
/*        System.out.println(solution(new int [] {3,3,3}));
        System.out.println(solution(new int [] {3,2,1}));
        System.out.println(solution(new int [] {8,8,5,7,9,8}));*/
    }

    public static int solution(int[] H){

        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        for(int i = 0; i < H.length; i++){
            if(stack.size() == 0)
            {
                count++;
                stack.push(H[i]);
            }else{
                if(stack.peek() > H[i]){
                    while(stack.size() > 0 && stack.peek() > H[i]){
                        stack.pop();
                    }
                    i--;
                }else if(stack.peek() < H[i]){
                    count++;
                    stack.push(H[i]);
                }
            }
        }
        return count;
    }
}
