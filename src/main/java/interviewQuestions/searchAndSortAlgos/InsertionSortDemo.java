package interviewQuestions.searchAndSortAlgos;

public class InsertionSortDemo {

	public static void main(String[] args) {
		
		int[] arr = {5, 4, 10, 3, 1, 6, 2};
		
		InsertionSortArray(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static int[] InsertionSortArray(int[] arr) {
		int length = arr.length;
		
		for(int i = 1; i < length; i++) {
			
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) {
				
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		return arr;
		
	}
}
