package DSApatterns.slidingWindow;

/*
https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaxAverageSubarrayOfSizeK {

    public double findMaxAverage(int[] nums, int k) {
        double currentWindowSum = 0;

        for(int i = 0; i < k; i++) {
            currentWindowSum+= nums[i];
        }

        double maxSum = currentWindowSum;


        for(int i = k; i < nums.length; i++) {
            currentWindowSum = currentWindowSum + nums[i] - nums[i-k];
            maxSum = Math.max(currentWindowSum, maxSum);
        }

        return maxSum/k; // return average at the end
    }
}
