package codillity.lesson3;

public class FrogJumps {

    public static void main(String[] args) {
        System.out.println(numOfJumps());
    }
    static int numOfJumps(){
        int X = 1, Y = 1, D = 2, numOfJumps = 0;

        while (X < Y){
            X += D;
            numOfJumps++;
        }
        return numOfJumps;
    }
}
