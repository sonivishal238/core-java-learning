package problemSolving.interviewQuestions.arrays.easy;

public class OnlySingleDigitFromArrayOfPairs {

	public static void main(String[] args) {
		
		/*
		 * Array hai jisme saare elements pair me hai and only 1 hi element single hai, find single
		 */
		
		int[] arr = {1,4,1,6,6,4,7};
		int ans = 0;
		
		for(int num : arr) {
			ans = ans^num;
		}
		
		System.out.println(ans);
		
	}

}
