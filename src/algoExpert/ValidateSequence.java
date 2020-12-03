package algoExpert;

import java.util.ArrayList;
import java.util.List;

public class ValidateSequence {

    public static void main(String[]args) {

    }

    static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {


        int sequenceIndexToCheck = 0;

        for(int i = 0; i < array.size(); i++){

            if(array.get(i).equals(sequence.get(sequenceIndexToCheck))){
                sequenceIndexToCheck++;
            }
            if(sequenceIndexToCheck == sequence.size()){
                return true;
            }
        }
        return false;
    }
}

