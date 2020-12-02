package codillity.lesson5;

public class CountDiv {
    public static void main(String[] args) {

        System.out.println(
                solution(0, 10, 1));
        System.out.println(
                solution(0, 11, 4));
        System.out.println(
                solution(0, 1, 11));
        System.out.println(
                solution(6, 11, 2));
        System.out.println(
                solution(4, 16, 4));
        System.out.println(
                solution(5, 25, 5));
        System.out.println(
                solution(11, 345, 17));
    }

    public static int solution(int A, int B, int K) {

        int divisibleNumsCounter = 0;

        //Division by zero solution or first number is divisible
        if (A == 0 | A % K == 0) {
            divisibleNumsCounter++;
        }

        //Checks if further division possible
        if (K <= B) {
            divisibleNumsCounter += (B / K) - (A / K);
        }

        return divisibleNumsCounter;




/*        if((B - A) % K == 1){
            divisibleNumsCounter++;
        }*//*

        System.out.println("Div: " + (B - A) / K);
        System.out.println("Mod: " + (B - A) % K);*/

    }
}
