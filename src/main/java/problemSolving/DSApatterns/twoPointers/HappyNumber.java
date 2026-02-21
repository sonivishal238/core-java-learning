package problemSolving.DSApatterns.twoPointers;

/*
https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    public boolean isHappy(int n) {

        // The problem runs on the linked list cycle detection problem
        int slow = n, fast = n;

        do {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        }
        while(fast!=1 && slow != fast);

        return fast == 1;
    }

    static int getSum(int n) {
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;

            sum+=digit*digit;
            n/=10;
        }

        return sum;
    }
}
