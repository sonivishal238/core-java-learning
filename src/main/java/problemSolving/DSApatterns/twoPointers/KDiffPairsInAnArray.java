package problemSolving.DSApatterns.twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {

    public int findPairsViaTwoPointer(int[] nums, int k) {
        if (k < 0) return 0;

        Arrays.sort(nums);
        int left = 0, right = 1, count = 0;

        while (right < nums.length) {
            if (left == right) {
                right++;
                continue;
            }
            int diff = nums[right] - nums[left];
            if (diff == k) {
                count++;
                left++;
                right++;

                while (right < nums.length && nums[right] == nums[right - 1]) {
                    right++;   // skip duplicates on right
                }
            }
            else if (diff < k) {
                right++;
            }
            else {
                left++;
            }
        }

        return count;
    }

    public int findPairsViaHashMap(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        // Build frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : map.keySet()) {
            if (k == 0) {
                // Need frequency >= 2
                if (map.get(num) >= 2) {
                    count++;
                }
            } else {
                // Check if num + k exists
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
