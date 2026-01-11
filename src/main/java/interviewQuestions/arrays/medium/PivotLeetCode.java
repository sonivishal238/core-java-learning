package interviewQuestions.arrays.medium;

public class PivotLeetCode {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3};

		System.out.println("pivot is:" + pivotIndex(arr));
	}

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Check if the sum of elements to the left is equal to the sum of elements to the right
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the pivot index
            }

            // Update the sum of elements to the left
            leftSum += nums[i];
        }

        return -1; // No pivot index found
    }
}
