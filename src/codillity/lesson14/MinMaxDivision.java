package codillity.lesson14;

public class MinMaxDivision {
    public static void main(String[] args){

/*        System.out.println(solution(3,5, new int [] {2,1,5,1,2,2,2}));
        System.out.println(solution(2, 5, new int [] {3, 5}));*/
        //System.out.println(solution(3, 6, new int [] {5, 2, 3, 4, 6}));
        System.out.println(solution( 4, 10, new int [] {3, 4, 5, 6, 7, 8}));
    }

    public static int solution(int K, int M, int[] A){

        // Element in A ( 0 -> M)
        // N is the A.length (N, K 1 -> 100,000)
        // M (max of As) (0 -> 10,000)
        // K is the num of blocks
        // Sum of block is from X to Y
        // Return smallest possible large block

        // THEREFORE
        // result <= M*K
        // Suspected K > A.length

        int [] prefixSums = new int [A.length+1];

        prefixSums[0] = 0;
        for(int i = 1; i < prefixSums.length; i++){
            prefixSums[i] = prefixSums[i-1] + A[i-1];
        }

        //Smallest possible largest block
        int commonBlockAvg = (int) Math.ceil((double) prefixSums[prefixSums.length-1] / K);
        int result = commonBlockAvg;
        int lastBlockSum = commonBlockAvg;
        int lastPrefix = 0;

        for(int i = 1; i < prefixSums.length; i++){

            if(prefixSums[i]>=lastBlockSum){
                if(prefixSums[i-1]-prefixSums[lastPrefix]>result){
                    result = prefixSums[i-1]-prefixSums[lastPrefix];
                }
                lastPrefix = i-1;
                lastBlockSum+=commonBlockAvg;
            }
        }

        //check last box
        if(prefixSums[prefixSums.length - 1]>=lastBlockSum) {
            if (prefixSums[prefixSums.length - 1] - prefixSums[lastPrefix] > result) {
                result = prefixSums[prefixSums.length - 1] - prefixSums[lastPrefix];
            }
        }

        return result;
    }
}
