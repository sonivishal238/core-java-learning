package interviewQuestions.stringquestions;

public class lengthOfLongestSubsequenceWhichIsASubstringOfStringB {
    public static int longestSubsequence(String x, String y) {
        int maxLen = 0;

        for (int i = 0; i < y.length(); i++) {
            for (int j = i + 1; j <= y.length(); j++) {
                String sub = y.substring(i, j);

                if (sub.length() > maxLen && isSubsequence(sub, x)) {
                    maxLen = sub.length();
                }
            }
        }

        return maxLen;
    }

    private static boolean isSubsequence(String substring, String x) {
        int i = 0, j = 0;

        while (i < substring.length() && j < x.length()) {
            if (substring.charAt(i) == x.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == substring.length();
    }

}
