package problemSolving.DSApatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/fruit-into-baskets/
based on LongestSubstringWithKUniques, more of kike longest substring with uniques <= k
 */
public class FruitsInTheBasketLeetCode {

    public int totalFruit(int[] fruits) {
        int len = fruits.length;

        Map<Integer, Integer> freq = new HashMap<>();

        int left = 0, maxLen = -1;

        for(int right = 0; right < len; right++) {
            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            if(freq.size() <= 2)
                maxLen = Math.max(maxLen, right-left+1);


            while(freq.size() > 2 && left < right) {
                int key = fruits[left++];
                int value = freq.get(key);

                if(value == 1) freq.remove(key);
                else freq.put(key, value-1);
            }
        }

        return maxLen;
    }
}
