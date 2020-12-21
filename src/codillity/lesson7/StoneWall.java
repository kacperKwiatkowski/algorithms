package codillity.lesson7;

import java.util.Stack;

public class StoneWall {

    public static void main(String[] args){
        System.out.println(solution(new int [] {8,8,5,7,9,8,7,4,8}));
        System.out.println(solution(new int [] {3,3,3}));
        System.out.println(solution(new int [] {3,2,1}));
        System.out.println(solution(new int [] {8,8,5,7,9,8}));
    }

    public static int solution(int[] H){

        Stack<Integer> stack = new Stack<>();
        int amountOfBlocks = 0;
        int currentDesiredHeight = 0;


        int i = 0;
        currentDesiredHeight=H[i];
        while(i < H.length){

            if (H[i]>currentDesiredHeight){
                stack.add(H[i]-currentDesiredHeight);
            } else if (H[i] == currentDesiredHeight) {

                if(!stack.isEmpty()){
                    amountOfBlocks += solution(stack.stream().mapToInt(j->j).toArray());
                    stack = new Stack<>();
                }

            } else if (H[i]<currentDesiredHeight){
                amountOfBlocks++;
                if(!stack.isEmpty()){
                    amountOfBlocks += solution(stack.stream().mapToInt(j->j).toArray());
                    stack = new Stack<>();
                }
                currentDesiredHeight=H[i];
            }

            if(i == H.length-1){
                if(!stack.isEmpty()){
                    amountOfBlocks += solution(stack.stream().mapToInt(j->j).toArray());
                    stack = new Stack<>();
                }
                amountOfBlocks++;
            }

            i++;
        }

        return amountOfBlocks;
    }
}
