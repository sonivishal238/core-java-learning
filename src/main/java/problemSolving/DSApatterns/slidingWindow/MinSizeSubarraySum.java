package problemSolving.DSApatterns.slidingWindow;

/**
 * Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 *
 * Problem:
 * Given an array of positive integers and a target,
 * find the minimal length of a contiguous subarray
 * of which the sum is greater than or equal to target.
 * If no such subarray exists, return 0.
 *
 * Approach:
 * - Use Sliding Window (Two Pointers).
 * - Expand right pointer to increase sum.
 * - Shrink left pointer when sum >= target to minimize length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MinSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
