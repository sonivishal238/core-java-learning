package problemSolving.interviewQuestions.stringquestions.easy;

import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        Map<Character, Integer> romans = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romans.get(s.charAt(i));

            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }

            prev = current;
        }

        return result;
    }
}