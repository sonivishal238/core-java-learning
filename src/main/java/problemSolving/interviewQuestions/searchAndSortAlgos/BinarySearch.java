package problemSolving.interviewQuestions.searchAndSortAlgos;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,99,100, 102};
		
		System.out.println(isElementPresent(arr, 99));
	}

	private static boolean isElementPresent(int[] arr, int key) {
		int left = 0, length = arr.length, right = length-1, mid = left + (right-left)/2;
		
		while(left <= right) {
			
			if(arr[mid] == key) {
				return true;
			}
			
			if (arr[mid] > key) {
				right = mid - 1;
			}
			
			else {
				left = mid + 1;
			}
			
			mid = left + (right-left)/2;
		}
		
		return false;
	}
}
