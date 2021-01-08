package codillity.lesson11;

import utils.Printer;

import java.util.*;

public class CountSemiprimes {

    public static void main(String[] args) {

        Printer.printArray(solution(26, new int[]{1, 4, 16}, new int[]{26, 10, 20}));
        Printer.printArray(solution(1, new int[]{1}, new int[]{1}));

    }

    public static int[] solution(int N, int[] P, int[] Q) {

        // In range 1 to N, each prime * 2 is subprime

        int[] result = new int[P.length];
        int[] prefixOfSemiPrimes = new int[N+1];

        Set<Integer> primes = new HashSet<>();

        if(N>3){
            prefixOfSemiPrimes[4]++;
        }

        for(int i = 3; i <= N; i++){

            if(i<=N/2 && isPrime(i)){
                primes.add(i);
                prefixOfSemiPrimes[i*2]++;
            }

            for(Integer prime : primes){
                if(i%prime==0 && i/prime>2 && isPrime(i/prime)){
                    prefixOfSemiPrimes[i]++;
                    break;
                }
            }

            prefixOfSemiPrimes[i]+=prefixOfSemiPrimes[i-1];
        }

        for(int i = 0; i < P.length; i++){
            result[i] = prefixOfSemiPrimes[Q[i]]-prefixOfSemiPrimes[P[i]-1];
        }

        return result;
    }

    private static boolean isPrime(int checkIfPrime) {
        if (checkIfPrime == 2)
            return true;
        else if (checkIfPrime % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(checkIfPrime); i += 2) {
            if (checkIfPrime % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isSubPrime(int checkIfSubprime) {

        return true;
    }

}
