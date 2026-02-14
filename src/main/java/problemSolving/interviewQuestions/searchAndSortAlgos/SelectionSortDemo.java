package problemSolving.interviewQuestions.searchAndSortAlgos;

public class SelectionSortDemo {

	public static void main(String[] args) {
		
		int[] arr = {5, 4, 10, 3, 1, 6, 2, 3};
		
		SelectionSortArray(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static int[] SelectionSortArray(int[] arr) {
		int length = arr.length;
		
		for(int i = 0; i < length-1; i++) {
			int minIndex = i;
			
			for(int j = i+1; j < length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
			}
			
		}
		
		return arr;
		
	}
}
