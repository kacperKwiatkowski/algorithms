package codillity.lesson5;

public class PassingCars {

    // array A of 0s & 1s
    // 0 -> east
    // 1 -> west

    public static void main(String[] args) {

        System.out.println(solution(new int[]{0, 1, 0, 1, 1, 0, 1}));

    }

    public static int solution(int[] A) {

        int passingCars = 0;
        int carsDrivingEast = 0;

        for (int i : A) {
            if (i == 0) {
                carsDrivingEast++;
            } else {
                passingCars += carsDrivingEast;
            }
        }

        if (passingCars > 1000000000 || passingCars < 0) {
            return -1;
        }

        return passingCars;
    }

}
