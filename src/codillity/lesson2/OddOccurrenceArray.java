package codillity.lesson2;

public class OddOccurrenceArray {

    public static void main(String [] args){

        System.out.println(foundValue());

    }

    static int foundValue() {
        int[] A = {9, 13, 7, 11, 13, 9, 7};
        int i = 0, j;

        do {
            if (A[i] == 0) {
                i++;
                continue;
            }
            for (j = i + 1; j < A.length; j++) {
                if (A[j] == A[i]) {
                    A[i] = 0;
                    A[j] = 0;
                    break;
                }
            }
            i++;
        } while (i < A.length);

        for (i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                break;
            } else {
                continue;
            }
        }
        return A[i];
    }


}
