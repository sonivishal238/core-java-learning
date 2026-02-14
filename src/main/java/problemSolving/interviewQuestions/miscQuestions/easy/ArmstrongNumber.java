package problemSolving.interviewQuestions.miscQuestions.easy;

import org.testng.annotations.Test;

/*
Aisa number jisme har 1 digit ko number of digitd ki power pe raise krke sabka sum krke same number aajaye

153 → 1³ + 5³ + 3³ = 153 ✅

9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 ✅
 */
public class ArmstrongNumber {
    @Test
    public void test() {
        int number = 2000;

        int noOfDigit = 0;
        int temp = number;
        int armSum=0;
        while(temp > 0) {
            noOfDigit++;
            temp/=10;
        }

        System.out.println("Number of digits: " + noOfDigit);
         temp = number;
        while(temp > 0) {
            int rem = temp % 10;
            armSum+=Math.pow(rem, noOfDigit);
            temp/=10;
        }

        if(armSum == number) System.out.println(true);
        else System.out.println(false);
    }
}
