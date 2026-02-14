package problemSolving.DSApatterns.slidingWindow;

import java.util.*;

/*
https://leetcode.com/problems/sliding-subarray-beauty/
 */
public class SlidingSubArrayBeauty {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] result  = new int[nums.length-k+1];
        TreeMap<Integer, Integer> counter = new TreeMap<>();

        // first window
        for(int i = 0; i < k; i++) {
            if(nums[i] < 0)
                counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }
        result[0] = getXthElement(counter, x);

        // remaining array windows
        for(int i = k; i < nums.length; i++) {
            // remove outgoing
            if(nums[i-k] < 0) {
                int freq = counter.get(nums[i-k]);
                if(freq == 1)
                    counter.remove(nums[i-k]);
                else
                    counter.put(nums[i-k], freq-1);
            }

            // add incoming
            if(nums[i] < 0)
                counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);

            // update result
            result[i-k+1] = getXthElement(counter, x);
        }

        return result;
    }

    private static int getXthElement(TreeMap<Integer, Integer> map, int x) {
        int count = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count+=entry.getValue();
            if(count>=x) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
