package problemSolving.DSApatterns.twoPointers;

/*
https://leetcode.com/problems/merge-sorted-array/description/
 */
public class MergeTwoSortedArrays {

	// Driver Code
	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 6, 10, 0, 0 };
		int[] arr2 = { 2, 5 };
		System.out.println(mergeArrays(arr1, arr2, 4, 2));

		for (int n : arr1) {
			System.out.println(n);
		}
	}

	public static int[] mergeArrays(int arr1[], int arr2[], int m, int n) {
		int i = m - 1; // Index of last element in arr1
		int j = n - 1; // Index of last element in arr2
		int k = m + n - 1; // Index of last element in merged arr1

// Merge arr1 and arr2, starting from the end
		while (i >= 0 && j >= 0) {
			if (arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				i--;
			} else {
				arr1[k] = arr2[j];
				j--;
			}
			k--;
		}

// If there are remaining elements in arr2, copy them to arr1
		while (j >= 0) {
			arr1[k] = arr2[j];
			j--;
			k--;
		}

		return arr1;
	}
}
