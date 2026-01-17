package interviewQuestions.stringquestions;

import java.util.Collections;
import java.util.List;

public class MaxRequestInAWindow {
    public static int maxRequestsInWindow(List<Integer> timestamp, int windowSize) {
        Collections.sort(timestamp);

        int left = 0;
        int maxRequests = 0;

        for (int right = 0; right < timestamp.size(); right++) {
            while (timestamp.get(right) - timestamp.get(left) >= windowSize) {
                left++;
            }
            maxRequests = Math.max(maxRequests, right - left + 1);
        }

        return maxRequests;
    }

}
