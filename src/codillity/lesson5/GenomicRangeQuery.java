package codillity.lesson5;

import utils.Printer;

public class GenomicRangeQuery {
    public static void main(String[] args){

        //A = 1
        //C = 2
        //G = 3
        //T = 4

        //S is the DNA sequence
        //K is arr index
        //K is < than 0 and M
        //M is arr length
        //P[K] and Q[K] are indexes of S
        //P[K] and Q[K] are range in S
        //impact factor is the lowest nucleotide

        Printer.printArray(
                solution("CAGCCTA", new int[] {2, 5, 0},   new int[] {4, 5, 6}));
        Printer.printArray(
                solution("CAGCCTA", new int[] {6, 1, 0},   new int[] {6, 2, 4}));
        Printer.printArray(
                solution("CAGCCTA", new int[] {2, 4, 3},   new int[] {3, 5, 3}));
    }

    public static int [] solution(String S, int[] P, int[] Q){
        //FIXME Apply prefix sum method

        int index;

        //The returned result will have length of any given sequence
        int [] result = new int [P.length];
        String nucleotideSequence;

        for(index = 0; index < result.length; index++){

            nucleotideSequence = S.substring(P[index], Q[index] + 1);

            if(nucleotideSequence.contains("A")){
                result[index]=1;
            } else if (nucleotideSequence.contains("C")){
                result[index]=2;
            } else if (nucleotideSequence.contains("G")){
                result[index]=3;
            } else {
                result[index]=4;
            }
        }

        return result;
    }
}
