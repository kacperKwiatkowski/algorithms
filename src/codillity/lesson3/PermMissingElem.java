package codillity.lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println(missingNum());
    }

    static int missingNum() {
        int[] A = {2};
        int i = 0;

        Arrays.sort(A);
        if(A.length == 0){
            return 1;
        } else {
            while (i < A.length){
                if(i+1 != A[i]){
                    return i+1;
                }
                i++;
            }
        }
        return i+1;

    }
}
