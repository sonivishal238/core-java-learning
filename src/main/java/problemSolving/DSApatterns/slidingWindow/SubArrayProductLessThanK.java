package problemSolving.DSApatterns.slidingWindow;

/*
https://leetcode.com/problems/subarray-product-less-than-k/description/
 */
public class SubArrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0,  count = 0, product= 1;

        for(int right = 0; right < nums.length; right++) {
            product*=nums[right];

            // remove outgoing
            while(product >= k && left<=right)
                product /= nums[left++];

            count+=(right-left+1);
        }

        return count;
    }
}
