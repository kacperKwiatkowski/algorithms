package codillity.lesson9;


import utils.Printer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSliceSum {
    public static void main(String[] args){
        System.out.println(solution(new int []{3, 2, -6, 4, 0}));
        System.out.println(solution(new int []{-4, 8, 0, 2, 9, -11}));
        System.out.println(solution(new int []{-4, 2, -4, 2, 3, -1}));
        System.out.println(solution(new int []{1}));
        System.out.println(solution(new int []{-8, -6, -4, -2, -1}));
    }

    public static int solution(int [] A){

        int biggestSlice = A[0];
        int slice = 0;

        for (int j : A) {

            slice += j;

            if (slice > biggestSlice) biggestSlice = slice;

            if (slice < 0) {
                slice = 0;
            }

        }
        return biggestSlice;
    }
}
