package stringquestions;

public class LongestPalindromicSubstring {

    public static String findLongestPalindrome(String input) {

        if (input == null || input.length() < 2) {
            return input;
        }

        int startIndexOfLongest = 0;
        int lengthOfLongest = 1;

        for (int centerIndex = 0; centerIndex < input.length(); centerIndex++) {

            // Odd length palindrome
            int oddLength = expandAroundCenter(input, centerIndex, centerIndex);

            // Even length palindrome
            int evenLength = expandAroundCenter(input, centerIndex, centerIndex + 1);

            int longerLength = Math.max(oddLength, evenLength);

            if (longerLength > lengthOfLongest) {
                lengthOfLongest = longerLength;
                startIndexOfLongest = centerIndex - (longerLength - 1) / 2;
            }
        }

        return input.substring(
                startIndexOfLongest,
                startIndexOfLongest + lengthOfLongest
        );
    }

    private static int expandAroundCenter(
            String text,
            int leftIndex,
            int rightIndex) {

        while (leftIndex >= 0
                && rightIndex < text.length()
                && text.charAt(leftIndex) == text.charAt(rightIndex)) {

            leftIndex--;
            rightIndex++;
        }

        return rightIndex - leftIndex - 1;
    }

    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("babad")); // bab or aba
        System.out.println(findLongestPalindrome("cbbd"));  // bb
    }
}
