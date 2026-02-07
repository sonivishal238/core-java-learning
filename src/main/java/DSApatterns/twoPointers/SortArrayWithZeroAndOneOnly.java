package DSApatterns.twoPointers;

public class SortArrayWithZeroAndOneOnly {

	public static void main(String[] args) {
		
		int arr[] = {1,1,0,0,0,0,1,0,1,0,1,0,1,0};
		sortOne(arr);
		for(int value : arr) {
			System.out.print(value+" ");
		}
	}

	private static void sortOne(int[] arr) {

		int left = 0, right = arr.length - 1;
		
		while(left < right) {
			if(arr[left] == 0) {
				left++;
			}
			
			else if(arr[right] == 1) {
				right--;
			}
			
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
		}
		
	}
}
