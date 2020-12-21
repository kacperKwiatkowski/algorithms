package codillity.lesson7;

import java.util.Stack;

public class Nesting {

    public static void main(String[] args){

        System.out.println(solution("(()(())())"));
        System.out.println(solution("())"));
    }

    public static int solution(String S){

        int bracketsCounter = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i)=='(') {
                bracketsCounter++;
            } else if(S.charAt(i)==')'){
                if(bracketsCounter==0){
                    return 0;
                } else {
                    bracketsCounter--;
                }
            }
        }

        if(bracketsCounter==0){
            return 1;
        } else {
            return 0;
        }
    }
}
