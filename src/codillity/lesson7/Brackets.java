package codillity.lesson7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args){

/*        System.out.println(solution("{[()()]}"));*/
        System.out.println(solution("([)()]"));
/*        System.out.println(solution("({{({}[]{})}}[]{})"));*/
    }

    public static int solution(String S){

        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return 0;
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }



}
