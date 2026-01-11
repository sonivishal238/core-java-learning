package interviewQuestions.arrays.medium;

public class FindElementInSortedRoatedArray {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7, 8,10,2}; // this is a sorted rotated array
		
		System.out.println("Pivot index: " + getPivot(arr , 7));
		System.out.println("Element in array index: "+findInSortedRotatedArray(arr, 7, 10));

	}
	
	static int findInSortedRotatedArray(int[] arr, int size, int key) {
		
		int pivot = getPivot(arr, size);
		
		if(key >= arr[pivot] && key <= arr[size-1]) {
			return BinarySearchMethod(arr, pivot, size-1, key);
		}
		
		else {
			return BinarySearchMethod(arr, 0, pivot-1, key);
		}
	}

    /*
    Pivot: Minimum or maximum element of the sorted rotated array
     */
	static int getPivot(int[] arr, int size) {
		int s = 0;
		int e = size-1;
		int mid = s + (e-s)/2;
		
		while(s < e) {
			if(arr[mid] >= arr[0]) {
				s = mid + 1;
			}
			else {
				e = mid;
			}
			
			mid = s + (e-s)/2;
		}
		
		return s;
	}
	
	static int BinarySearchMethod(int[] arr, int s, int e, int key) {
		int left = s, right = e, mid = left + (right-left)/2;
		
		while(left <= right) {
			
			if(arr[mid] == key) {
				return mid;
			}
			
			if (arr[mid] > key) {
				right = mid - 1;
			}
			
			else {
				left = mid + 1;
			}
			
			mid = left + (right-left)/2;
		}
		
		return -1;
	}
}
