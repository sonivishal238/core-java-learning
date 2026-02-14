package problemSolving.DSApatterns.twoPointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUnsortedArray {

    public static void main(String[] args) {
        int nums[] = {2, 11, 7, 25, 1, 56, 78, 9, 10};

        for(int num : getTwoSums(nums, 71)) {
            System.out.println(num);
        }
    }

    static int[] getTwoSums(int[] nums, int key) {
        Map<Integer, Integer> results = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int comp = key - nums[i];

            if(results.containsKey(comp)) {
                return new int[] {results.get(comp), i};
            }

            results.put(nums[i], i);
        }

        return new int[] {};
    }

}
