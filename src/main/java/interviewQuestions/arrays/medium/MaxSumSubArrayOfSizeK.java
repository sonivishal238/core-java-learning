package interviewQuestions.arrays.medium;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubarraySum(arr, k));
    }

    static int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return -1;

        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }

        int maxSum = windowSum;

        for(int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

}
