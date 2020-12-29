package codillity.lesson9;


public class MaxProfit {
    public static void main(String[] args){
        System.out.println(solution(new int []{23171, 21011, 21123, 21366, 21013, 21367}));
        System.out.println(solution(new int []{0}));
        System.out.println(solution(new int []{1}));
        System.out.println(solution(new int []{111, 11}));
        System.out.println(solution(new int []{8, 9, 3, 6, 1, 2}));
    }

    public static int solution(int [] A){

        int profit = 0;
        int biggestProfit = 0;
        int stockBuyDay = 0;

        for (int i = 1; i < A.length; i++){

            profit = A[i] - A[stockBuyDay];

            if(profit < 0){
                profit=0;
                stockBuyDay = i;
            } else if (profit > biggestProfit){
                biggestProfit = profit;
            }

        }
        return biggestProfit;
    }
}
