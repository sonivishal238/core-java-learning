package problemSolving.interviewQuestions.arrays.hard;

import java.util.Arrays;

public class EKO {

	public static void main(String[] args) {
		int[] arr = {20, 15, 10, 17};

		System.out.println("Answer is : " + getValue(arr, 50));

	}

	static int getValue(int[] arr, int woodRequired) {

		int start = 0;
		int max = Arrays.stream(arr).max().getAsInt();
		
		int mid = start + (max - start)/2;
		
		while(start <= max) {
			int woodCollected = calculateWood(arr, mid);
			
			if(woodCollected == woodRequired)
				return mid;
			
			if(woodCollected > woodRequired) {
				start = mid + 1;
			}
			
			else {
				max = mid - 1;
			}
			
			mid = start + (max - start)/2;
		}
		
		return -1;
		
	}

	private static int calculateWood(int[] arr, int proposedHeight) {

		int woodsCollected = 0;
		
		for(int treeHeight : arr) {
			if(treeHeight > proposedHeight) {
				woodsCollected += treeHeight - proposedHeight; 
			}
		}
		
		return woodsCollected;
	}
}
