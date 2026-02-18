package problemSolving.DSApatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLengthWithoutRepeatingChar {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("abcaaaabcbc"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int left = 0, right = 0, maxLen = Integer.MIN_VALUE;
		Map<Character, Integer> freq = new HashMap<>();

		for(; right < s.length(); right++) {
			if (freq.containsKey(s.charAt(right))) {
				left = Math.max(left, freq.get(s.charAt(right)) + 1);
			}

			freq.put(s.charAt(right), right);
			maxLen = Math.max(maxLen, right - left + 1);

		}

		return maxLen;
	}

}
