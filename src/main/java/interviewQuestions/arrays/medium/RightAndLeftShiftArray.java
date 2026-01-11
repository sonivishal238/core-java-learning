package interviewQuestions.arrays.medium;

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
		if(k == n) {
			return arr;
		}
		
		int temp[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			temp[(i+k)%n] = arr[i];
		}
		
		return temp;
	}
	
	static int[] LeftShift(int[] arr, int k) {
		int n = arr.length;
		
		if(k == n) {
			return arr;
		}
		
		int temp[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			temp[(i+n-k)%n] = arr[i];
		}
		
		return temp;
	}
}
