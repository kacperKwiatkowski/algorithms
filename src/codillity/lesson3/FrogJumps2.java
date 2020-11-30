package codillity.lesson3;

public class FrogJumps2 {

    public static void main(String[]args){
        System.out.println(numOfJumps());
    }

    static int numOfJumps() {
        int X = 1, Y = 10, D = 2, numOfJumps = 0;

        if((Y - X) % D == 0){
            return (Y - X) / D;
        } else {
            return (Y - X) / D + 1;
        }
    }

}
