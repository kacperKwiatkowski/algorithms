package codillity.lesson7;

import java.util.Stack;

public class StoneWall {

    public static void main(String[] args){
        System.out.println(solution(new int [] {8,8,5,7,9,8,7,4,8}));
        System.out.println(solution(new int [] {3,3,3}));
        //System.out.println(solution(new int [] {3,2,1}));
    }

    public static int solution(int[] H){

        Stack<Integer> heightsToFill = new Stack<>();
        int amountOfBlocks = 0;
        int currentDesiredHeight = H[0];

        int i = 0;
        while(i < H.length){



            if(H[i]<=currentDesiredHeight || i == H.length-1){

                currentDesiredHeight=H[i];
                amountOfBlocks++;
                if(!heightsToFill.isEmpty()){
                    int [] SH = heightsToFill.stream().mapToInt(j -> j).toArray();
                    amountOfBlocks += solution(SH);
                }
            } else if(H[i]>currentDesiredHeight){
                heightsToFill.add(H[i]-currentDesiredHeight);
            }
            i++;
        }

        return amountOfBlocks;
    }
}
