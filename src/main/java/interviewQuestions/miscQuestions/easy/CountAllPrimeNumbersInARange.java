package interviewQuestions.miscQuestions.easy;

public class CountAllPrimeNumbersInARange {
    public static void main(String[] args) {

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
}
