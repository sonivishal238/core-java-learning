package problemSolving.DSApatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniques {

    public int longestKSubstr(String s, int k) {
        int len = s.length();
        Map<Character, Integer> freq = new HashMap<>();

        int left = 0, maxlength = -1;

        for(int right = 0; right < len; right++) {
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);

            // Only update when exactly k distinct characters
            if (freq.size() == k) {
                maxlength = Math.max(maxlength, right - left + 1);
            }

            while(freq.size() > k && left < right) {
                char c = s.charAt(left++);
                int count = freq.get(c);

                if(freq.get(c) == 1) freq.remove(c);
                else freq.put(c, count-1);
            }

        }

        return maxlength;
    }
}
