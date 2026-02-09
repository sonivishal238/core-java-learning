package DSApatterns.twoPointers;

/*
https://leetcode.com/problems/3sum/description/

Given an integer array nums, return all the triplets
[nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSumToZero {

    /*
    Core Logic:
       a[i] + x + y = 0
       x+y = -a[i] => so basically find inverse two sum for each element of the array
     */


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break; // if smallest number is positive, then kabhi sum 0 ho hi nahi sakta, base case hai

            if (i > 0 && nums[i] == nums[i - 1]) continue; // duplicate values ignore krni hai as per problem statement

            int left = i + 1, right = len - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
