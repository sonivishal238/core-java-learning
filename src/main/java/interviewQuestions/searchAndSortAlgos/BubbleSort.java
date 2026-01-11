package interviewQuestions.searchAndSortAlgos;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {15, 14, 70, 80, 23};
		
		BubbleSortArray(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static int[] BubbleSortArray(int[] arr) {
		
		int length = arr.length;
		boolean flag = false;
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					// if sorting was done, that means we want to continue, other wise that means the array is sorted already so move.
					flag = true;
				}
				
				else {
					flag = false;
				}
			}
			
			if(!flag) {
				break;
			}
		}
		
		return arr;
	}

}
