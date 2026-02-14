package problemSolving.DSApatterns.twoPointers;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1
 */
public class ThreeSumSmallerThanTarget {

    long countTriplets(int length, int target, long arr[]) {
        Arrays.sort(arr);
        long result = 0;

        for (int i = 0; i < length - 2; i++) {
            int left = i + 1, right = length - 1;
            while (left < right) {
                long sum = arr[i] + arr[left] + arr[right];

                if (sum < target) {
                    result += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
