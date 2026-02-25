package problemSolving.DSApatterns.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/4sum/
 */
public class FourSumToTarget {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < len-3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j = i+1; j < len-2; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1, right = len-1;

                while(left < right) {
                    // this concept of summation is important
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left-1]) left++;
                        while(left < right && nums[right] == nums[right+1]) right--;
                    } else if(sum < target) left++;
                    else right--;
                }
            }

        }

        return result;
    }
}
