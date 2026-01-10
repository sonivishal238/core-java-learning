package interviewQuestions.arrays.easy;

import java.util.*;

public class UniqueNumberOfOccurences {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 1, 1, 3 };

		System.out.println(uniqueOccurrences(arr));
	}

	public static boolean uniqueOccurrences(int[] arr) {
		int length = arr.length;

        if(length<=1) return true;

        Set<Integer> resultSet = new HashSet<>();
        Map<Integer, Integer> frequencyCounter = new HashMap<>();

        for(int i : arr) {
            frequencyCounter.put(i, frequencyCounter.getOrDefault(i, 0) + 1);
        }

        for(int value : frequencyCounter.values()) {
            if(!resultSet.add(value)) {
                return false;
            }
        }

        return true;
	}

}
