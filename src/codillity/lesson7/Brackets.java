package codillity.lesson7;

public class Brackets {
    public static void main(String[] args){

        System.out.println(solution("{[()()]}"));
        System.out.println(solution("([)()]"));
        System.out.println(solution("({{({}[]{})}}[]{})"));

        ({{({}[]{})}}[]{})
    }

    public static int solution(String S){

        // check if empty
        if(S.isEmpty()){
            return 1;
        }

        // check if length is even number
        if(S.length()%2==1){
            return 0;
        }

        char c;
        boolean hasRoundBracketOccurred = false, hasCurlyBracketOccurred = false, hasSquareBracketOccurred = false;

        for(int i = 0, j = S.length()-1; i<j; i++, j--){

            switch (S.charAt(i)){
                case '(':
                    c = ')';
                    hasRoundBracketOccurred = true;
                    break;
                case '{':
                    c = '}';
                    hasCurlyBracketOccurred = true;
                    break;
                case '[':
                    c = ']';
                    hasSquareBracketOccurred = true;
                    break;
                case ')':
                    if(!hasRoundBracketOccurred){
                        return 0;
                    } else {
                        hasRoundBracketOccurred = false;
                    }
                    c = '(';
                    break;
                case '}':
                    if(!hasCurlyBracketOccurred){
                        return 0;
                    } else {
                        hasCurlyBracketOccurred = false;
                    }
                    c = '{';
                    break;
                default:
                    if(!hasSquareBracketOccurred){
                        return 0;
                    } else {
                        hasSquareBracketOccurred = false;
                    }
                    c = '[';
                    break;
            }

            if(S.charAt(j)!=c){
                return 0;
            }
        }

        return 1;
    }



}
