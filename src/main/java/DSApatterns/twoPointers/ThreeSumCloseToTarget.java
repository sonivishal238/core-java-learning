package DSApatterns.twoPointers;

import java.util.Arrays;

/*
https://leetcode.com/problems/3sum-closest/description/
 */
public class ThreeSumCloseToTarget {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int result = 0, prevDiff = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++) {
            int left = i+1, right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target) return target;

                int currentAbsoluteDiff = Math.abs(sum - target);

                if(prevDiff > currentAbsoluteDiff) {
                    prevDiff = currentAbsoluteDiff;
                    result = sum;
                } else if(sum > target) right--;
                else left++;

            }
        }

        return result;
    }
}
