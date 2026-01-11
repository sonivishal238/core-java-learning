package interviewQuestions.arrays.hard;

public class BookAllocationProblem {

	public static void main(String[] args) {
		int[] arr = {10, 20, 50, 30, 40};
		
		System.out.println("Answer is : " + getValue(arr, 5, 3));
	}
	
	static int getValue(int[] arr, int size, int noOfStudents) {
		
		int s = 0, e = 0;
		
		for(int val: arr) {
			e+=val;
		}
		
		int mid = s + (e-s)/2;
		int ans = -1;
		
		while(s <= e) {
			if(isPossibleSolution(arr, size, noOfStudents, mid)) {
				ans = mid;
				e = mid - 1;
			}
			
			else {
				s = mid + 1;
			}
			
			mid = s + (e-s)/2;
		}
		
		return ans;
	}

	
	private static boolean isPossibleSolution(int[] arr, int size, int noOfStudents, int mid) {
		
		int studentCount = 1;
		int pagesCount = 0;
		
		for(int i = 0; i < size; i++) {
			if(pagesCount+arr[i] <= mid) {
				pagesCount+=arr[i];
			}
			
			else {
				studentCount++;
				if(studentCount > noOfStudents || arr[i] > mid) {
					return false;
				}
				
				pagesCount = 0;
				pagesCount = arr[i];
			}
		}
		return true;
	}
}
