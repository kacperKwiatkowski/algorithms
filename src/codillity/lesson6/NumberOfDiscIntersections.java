package codillity.lesson6;

public class NumberOfDiscIntersections {
    public static void main(String[] args){
        System.out.println(solution(new int []{1,5,2,1,4,0}));

    }

    public static int solution(int[] A){

        int sumOfIntersects = 0;
        int minRange = 0, maxRange = 0;
        int numOfDiscs = A.length - 1;

        //less than two discs
        if(A.length < 2){
            return sumOfIntersects;
        }


        //find the range of discs
        for(int i = 0; i < A.length; i++){
            if(i-A[i]<minRange){
                //append min range
                minRange=i-A[i];
            } else if(A[i]+i>maxRange){
                //append max range
                maxRange=i+A[i];
            }
        }


        for(int j = 0; j < maxRange - 1; j++){
            int sumOfIntersectionsPerIndex = -1;
            for(int k = 0; k <= numOfDiscs; k++){
                if(k-A[k]<j & k+A[k]>j){
                    sumOfIntersectionsPerIndex++;
                } else if (A[k]==0 & k==j){
                    sumOfIntersectionsPerIndex++;
                }
            }
            sumOfIntersects+=sumOfIntersectionsPerIndex;
        }

        return sumOfIntersects;
    }
}
