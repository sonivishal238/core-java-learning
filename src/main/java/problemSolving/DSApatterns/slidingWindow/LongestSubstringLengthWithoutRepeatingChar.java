package problemSolving.DSApatterns.slidingWindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringLengthWithoutRepeatingChar {

	public static void main(String[] args) {
		
		System.out.println(characterReplacement("AABABBA", 1));
	}

	public static int characterReplacement(String s, int k) {
		int left = 0, right = 0, maxLen = Integer.MIN_VALUE;
		Map<Character, Integer> freq = new LinkedHashMap<>();

		for(; right < s.length(); right++) {
			Character c = s.charAt(right);

			if (!freq.containsKey(c)) {
				left = Math.max(left, right-left);
			}


			freq.put(s.charAt(right), right);
			maxLen = Math.max(maxLen, right - left + 1);

		}

		return maxLen;
	}

}
