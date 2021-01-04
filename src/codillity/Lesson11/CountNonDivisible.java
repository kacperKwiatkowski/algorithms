package codillity.Lesson11;

import utils.Printer;

import java.util.Arrays;

public class CountNonDivisible {
    public static void main(String[] args) {
        Printer.printArray(solution(new int[]{3, 1, 2, 3, 6}));
        System.out.println();
        Printer.printArray(solution(new int []{3,1,2,3,6,2,4}));
    }

    public static int[] solution(int[] A) {


        int[] sortedA = A.clone();
        Arrays.sort(sortedA);

        int[] occurrenceOfSuchNum = new int[sortedA[sortedA.length - 1] + 1];
        int[] sumOfDivisible = new int[sortedA[sortedA.length - 1] + 1];

        for (int k : sortedA) {
            occurrenceOfSuchNum[k]++;
        }

        for (int i = 1; i < occurrenceOfSuchNum.length; i++) {
            if (occurrenceOfSuchNum[i] != 0) {
                for (int j = 1; j < occurrenceOfSuchNum.length; j++) {
                    if(occurrenceOfSuchNum[i] != 0 && i%j!=0){
                        sumOfDivisible[i]+=occurrenceOfSuchNum[j];
                    }
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            A[i]=sumOfDivisible[A[i]];
        }

        return A;
    }
}
