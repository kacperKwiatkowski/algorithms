package codillity.lesson7;

import java.util.Stack;

public class Nesting {

    public static void main(String[] args){

        System.out.println(solution("(()(())())"));
        System.out.println(solution("())"));
    }

    public static int solution(String S){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i)=='(') {
                stack.add('(');
            } else if(S.charAt(i)==')'){
                if(stack.isEmpty()){
                    return 0;
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }
}
