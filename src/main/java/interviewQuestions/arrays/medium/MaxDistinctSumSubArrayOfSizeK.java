package interviewQuestions.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MaxDistinctSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(arr, k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // Shrink window if size exceeds k
            if (right - left + 1 > k) {
                int leftVal = nums[left];
                currentSum -= leftVal;
                freq.put(leftVal, freq.get(leftVal) - 1);
                if (freq.get(leftVal) == 0) {
                    freq.remove(leftVal);
                }
                left++;
            }

            // Check valid window
            if (right - left + 1 == k && freq.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

}
