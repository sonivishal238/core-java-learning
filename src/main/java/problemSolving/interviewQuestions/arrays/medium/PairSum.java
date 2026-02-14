package problemSolving.interviewQuestions.arrays.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PairSum {

	public static void main(String[] args) {
		/*
		 * find all values from array that amounts to sum Pairs should be sorted
		 * 
		 * Return the list of pairs sorted in non-decreasing order of their first value.
		 * In case if two pairs have the same first value, the pair with a smaller
		 * second value should come first.
		 */

	}

	public static List<int[]> pairSum(int[] arr, int s) {
		List<int[]> answer = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == s) {
					int[] temp = new int[2];
					temp[0] = Math.min(arr[i], arr[j]);
					temp[1] = Math.max(arr[i], arr[j]);
					answer.add(temp);
				}
			}
		}

		// Sort the answer list based on the first value in each pair
		answer.sort(Comparator.comparingInt((int[] pair) -> pair[0]).thenComparingInt(pair -> pair[1]));
		return answer;
	}

}
