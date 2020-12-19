package codillity.lesson6;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static void main(String[] args){
/*        System.out.println(solution(new int []{1,5,2,1,4,0}));*/
        System.out.println(
                solution(new int []{1, Integer.MAX_VALUE, 0}));

    }

    public static int solution(int[] A){

        int sumOfIntersects = 0;
        long [] minRanges = new long[A.length];
        long [] maxRanges = new long[A.length];

        //find the range of discs
        for(int i = 0; i < A.length; i++){
            minRanges[i] = i - A[i];
            maxRanges[i] = i + A[i];
        }

        Arrays.sort(minRanges);
        Arrays.sort(maxRanges);

        int j = 0;

        for(int i = 0; i < A.length; i++){
            while( j < A.length && maxRanges[i] >= minRanges[j]){
                sumOfIntersects += j; // add j intersections
                System.out.println(sumOfIntersects);
                sumOfIntersects -= i; // minus "i" (avoid double count)
                System.out.println(sumOfIntersects);
                j++;
            }
        }

        if(sumOfIntersects > 10_000_000){
            return -1;
        }

        return sumOfIntersects;
    }
}
