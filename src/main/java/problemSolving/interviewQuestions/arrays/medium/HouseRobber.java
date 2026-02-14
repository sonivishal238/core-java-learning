package problemSolving.interviewQuestions.arrays.medium;

/**
 * House Robber
 *
 * Problem:
 * Given an array representing money in each house,
 * determine the maximum amount that can be robbed
 * without robbing two adjacent houses.
 *
 * Approach:
 * - Dynamic Programming with space optimization.
 * - At each house: choose max of skipping or robbing it.
 * - Use two variables instead of DP array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * **Dry Run – House Robber**
 *
 * Example:
 * `nums = [2, 7, 9, 3, 1]`
 *
 * Initial:
 * `prev2 = 0` (i-2)
 * `prev1 = 0` (i-1)
 *
 * | House Money | curr = max(prev1, prev2 + num) | prev2 | prev1 |
 * | ----------- | ------------------------------ | ----- | ----- |
 * | 2           | max(0, 0+2) = **2**            | 0     | 2     |
 * | 7           | max(2, 0+7) = **7**            | 2     | 7     |
 * | 9           | max(7, 2+9) = **11**           | 7     | 11    |
 * | 3           | max(11, 7+3) = **11**          | 11    | 11    |
 * | 1           | max(11, 11+1) = **12**         | 11    | 12    |
 *
 * **Final Answer:** `12` ✅
 */
public class HouseRobber {

    public static int rob(int[] nums) {
        int prev2 = 0; // max till house i-2
        int prev1 = 0; // max till house i-1

        for (int money : nums) {
            int curr = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
