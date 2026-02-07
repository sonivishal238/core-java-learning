package DSApatterns.twoPointers;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        if(nums.length == 1) {
            return new int[] {nums[0] * nums[0]};
        }

        int[] result = new int[nums.length];

        int left = 0, right = nums.length - 1;
        int k = nums.length - 1;

        while(k >= 0) {
            if(Math.abs(nums[right]) >= Math.abs(nums[left])) {
                result[k--] = nums[right] * nums[right];
                right--;
            }

            else {
                result[k--] = nums[left] * nums[left];
                left++;
            }

        }

        return result;
    }
}
