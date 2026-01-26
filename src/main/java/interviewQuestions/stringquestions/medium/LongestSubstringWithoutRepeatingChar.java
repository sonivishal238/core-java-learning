package interviewQuestions.stringquestions.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		System.out.println(getLongestSubstringWithoutRepeatingChar("abcaaaabcbc"));
	}
	
	public static int getLongestSubstringWithoutRepeatingChar(String str) {
		
		int result = 0, left = 0, right = 0;
		
		Map<Character, Integer> map = new HashMap();
		
		char[] arr = str.toCharArray();
		
		for(; right < arr.length; right++) {
			
			int idx = map.getOrDefault(arr[right], -1);
			if(idx != -1 && idx >= left) {
				result = Math.max(result, right - 1 - left + 1);
				left = idx+1;
			}
			map.put(arr[right], right);
		}
		
		return Math.max(result, right - 1 - left + 1);
	}

}
