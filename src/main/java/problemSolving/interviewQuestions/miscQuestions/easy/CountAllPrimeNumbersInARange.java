package problemSolving.interviewQuestions.miscQuestions.easy;

import org.testng.annotations.Test;

public class CountAllPrimeNumbersInARange {
    @Test
    public void countInRange() {

        /*
            Sieve Algo
            Assume all are prime and mark them as true
            0, 1 are not prime by default
         */

        int range = 50;
        int count = 0;
        boolean primes[] = new boolean[range+1];

        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for(int i = 2; i < range; i++){
            if(primes[i] == true){
                count++;
            }

            for(int j = 2*i; j < range; j=j+i){
                primes[j] = false;
            }

        }

        System.out.println(count);
    }

    @Test
    public void isPrimeTest() {
        System.out.println(checkPrime(39));
    }
    static boolean checkPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
