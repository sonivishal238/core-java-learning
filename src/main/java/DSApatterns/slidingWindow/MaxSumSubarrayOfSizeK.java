package DSApatterns.slidingWindow;

public class MaxSumSubarrayOfSizeK {

    public int maxSubarraySum(int[] arr, int k) {
        //1. Calculate first window sum
        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }

        int maxSum = windowSum;

        // 2. Calculate for other windows
        for(int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }
}
