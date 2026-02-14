package problemSolving.interviewQuestions.arrays.hard;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 3, 6 };

		System.out.println("Answer is : " + getValue(arr, 2));

	}

	static int getValue(int[] arr, int noOfCows) {

		Arrays.sort(arr);

		int s = 0;
		int e = Arrays.stream(arr).max().getAsInt();
		int ans = -1, mid = s + (e - s) / 2;

		while (s <= e) {
			if (isPossibleSolution(arr, noOfCows, mid)) {
				ans = mid;
				s = mid + 1;
			}

			else {
				e = mid - 1;
			}
			
			mid = s + (e - s) / 2;
		}

		return ans;
	}

	private static boolean isPossibleSolution(int[] arr, int noOfCows, int mid) {

		int cowsCount = 1;
		int lastPosition = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - lastPosition >= mid) {
				cowsCount++;
				if(cowsCount == noOfCows)
					return true;
				
				lastPosition = arr[i];
			}
		}
		return false;
	}
}
