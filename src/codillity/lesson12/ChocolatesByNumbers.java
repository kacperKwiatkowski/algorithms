package codillity.lesson12;

import utils.Printer;

import java.util.HashSet;
import java.util.Set;

public class ChocolatesByNumbers {

    public static void main(String[] args) {
        System.out.println(solution(1, 2));
        System.out.println(solution(10, 4));
        System.out.println(solution(24, 18));
        System.out.println(solution(11, 2));
    }

    public static int solution(int N, int M) {
        return N / euclidean(N, M);
    }

    static int euclidean(int N, int M) {
        if(N % M == 0) return M;
        else           return euclidean(M, N % M);
    }
}
