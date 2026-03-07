package problemSolving.DSApatterns.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/fruit-into-baskets/
based on LongestSubstringWithKUniques, more of like longest substring with uniques <= k
 */
public class FruitsInTheBasketLeetCode {

    public int totalFruit(int[] fruits) {

        int len = fruits.length, maxFruits = -1;
        Map<Integer, Integer> counter = new HashMap<>();
        int left = 0;
        int baskets = 2;
        for(int right = 0; right < len; right++) {
            // add incoming
            counter.put(fruits[right], counter.getOrDefault(fruits[right], 0) + 1);

            // main business logic
            if(counter.size() <= baskets)
                maxFruits = Math.max(maxFruits, right-left + 1);

            while(counter.size() > baskets && left <= right) {
                // remove outgoing
                int key = fruits[left++];
                int value = counter.get(key);

                if(value == 1) counter.remove(key);
                else counter.put(key, value - 1);
            }
        }

        return maxFruits;
    }
}
