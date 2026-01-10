package interviewQuestions.arrays.easy;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = {10, 20, 50, 30, 40};
		
		// Using streams
		System.out.println(
				Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get());

		// Using logic
		int second = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for(int number : arr) {
			if(number > largest) {
				second = largest;
				largest = number;
			}
			
			else if(number > second && number != largest) {
				second = number;
			}
		}
		
		System.out.println(second);
	}

}
