package problemSolving.interviewQuestions.arrays.medium;

import java.util.Arrays;

public class RightAndLeftShiftArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};

		Arrays.stream(ShiftRight(arr, 3)).forEach(x -> System.out.print(x+" "));
		System.out.println();
		int[] arr2 = {1,2,3,4,5,6,7};
		Arrays.stream(LeftShift(arr2, 3)).forEach(x -> System.out.print(x+" "));
	}

	static int[] ShiftRight(int[] arr, int k) {
		int n = arr.length;
		if(k == n) return arr;
		
		int temp[] = new int[n];
		for(int i = 0; i < n; i++) {
			temp[(i+k)%n] = arr[i];
		}
		return temp;
	}

	static int[] LeftShift(int[] arr, int k) {
		int n = arr.length;
		if(k == n) return arr;
		int temp[] = new int[n];
		for(int i = 0; i < n; i++) {
			temp[(i+n-k)%n] = arr[i];
		}
		return temp;
	}

	static void rightShiftConstantSpace(int[] arr, int k) {
		int n = arr.length;
		k = k % n; // handle k > n

		/* Steps:
		1. Reverse the whole array
		2. Reverse first k elements
		3. Reverse remaining n - k elements
		 */
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	static void leftShiftConstantSpace(int[] arr, int k) {
		int n = arr.length;
		k = k % n; // handle k > n

		/* Steps:
		1. Reverse first k elements
		2. Reverse remaining n - k elements
		3. Reverse the whole array
		 */
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
