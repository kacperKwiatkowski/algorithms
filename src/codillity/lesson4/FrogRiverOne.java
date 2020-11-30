package codillity.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args){
        int[]A = {1, 3, 1, 4, 2, 5, 1, 1};

        System.out.println(secOfJump(A, 5));
    }

    static int secOfJump(int [] A, int X){
        Set<Integer> numbersToFind = new HashSet<>();
        int i;

        for(i = 1; i <= X; i++){
            numbersToFind.add(i);
        }

        i = 0;
        while (i < A.length){
            if (numbersToFind.contains(A[i])){
                numbersToFind.remove(A[i]);
            }

            if(numbersToFind.isEmpty()){
                return i +1;
            }

            i++;
        }

        return -1;
    }
}
