package problemSolving.interviewQuestions.arrays.easy;

public class CheckArrayIsSortedAndRotated {

	public static void main(String[] args) {
		int arr[] = {8,10, 4,5,6,7}; // this is a sorted rotated array
		
		System.out.println(isSortedRotated(arr));
		
	}

	static boolean isSortedRotated(int[] arr) {
		int count = 0;
		int size = arr.length;
		
		for(int i = 1; i < size; i++) {
            if(arr[i-1] > arr[i]) {
                count++;
            }
        }
        if(arr[size-1] > arr[0]) count++;

        return count <=1;
	}
}
