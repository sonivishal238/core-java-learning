package interviewQuestions.arrays.medium;

/**
 * Problem:
 * Given two strings x and y, find the length of the longest subsequence of x
 * that is also a substring of y.
 *
 * Note:
 * - Subsequence: characters in order, can skip
 * - Substring: continuous characters
 *
 * Approach:
 * 1. Generate all substrings of y
 * 2. Check if each substring is a subsequence of x
 * 3. Track maximum length
 *
 * Time Complexity: O(n^2 * m)
 */
public class LongestSubsequenceOfXWhichIsSubstringOfY {

    public static int longestSubsequence(String x, String y) {
        int maxLen = 0;

        for (int i = 0; i < y.length(); i++) {
            for (int j = i + 1; j <= y.length(); j++) {
                String sub = y.substring(i, j);
                if (sub.length() <= maxLen) continue;

                if (isSubsequence(sub, x)) {
                    maxLen = sub.length();
                }
            }
        }
        return maxLen;
    }

    private static boolean isSubsequence(String s, String x) {
        int i = 0, j = 0;
        while (i < s.length() && j < x.length()) {
            if (s.charAt(i) == x.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }
}
