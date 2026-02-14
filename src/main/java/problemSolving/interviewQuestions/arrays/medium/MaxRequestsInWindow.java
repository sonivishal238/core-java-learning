package problemSolving.interviewQuestions.arrays.medium;

import java.util.Collections;
import java.util.List;

/**
 * Problem:
 * Given an unsorted list of request timestamps (in minutes) and a window size,
 * find the maximum number of requests that occur in any continuous time window.
 *
 * Approach:
 * 1. Sort the timestamps
 * 2. Use sliding window (two pointers)
 * 3. Shrink window when time difference >= windowSize
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public class MaxRequestsInWindow {

    public static int maxRequests(List<Integer> timestamps, int windowSize) {
        Collections.sort(timestamps);

        int left = 0, max = 0;

        for (int right = 0; right < timestamps.size(); right++) {
            while (timestamps.get(right) - timestamps.get(left) >= windowSize) {
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
