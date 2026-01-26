package interviewQuestions.stringquestions.medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
 */
public class findAllAnagramsInAString {

    @Test
    public void test() {
        String s = "cbaebabacd", p = "abc";
        findAnagrams(s, p).forEach(index -> System.out.print(index + " "));
    }


    public List<Integer> findAnagrams(String s, String p) {
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();

        List<Integer> results = new ArrayList<>();

        int[] pCount = new int[26];

        for(int i = 0; i < p.length(); i++) {
            pCount[pArray[i]-'a']++;
        }

        int i = 0;
        int windowSize = p.length();
        int[] sCount = new int[26];

        // Checking if first window is anagram
        while(i < windowSize && i < s.length()) {
            sCount[sArray[i]-'a']++;
            i++;
        }

        if(isEqual(pCount, sCount)) {
            results.add(0);
        }

        while(i < s.length()) {
            char newChar = sArray[i];
            int index = newChar - 'a';
            sCount[index]++;

            char oldChar = sArray[i - windowSize];
            index = oldChar - 'a';
            sCount[index]--;

            i++;

            if(isEqual(pCount, sCount)) {
                results.add(i - windowSize);
            }
        }

        return results;

    }

    static Boolean isEqual(int[] c1, int c2[]) {
        for(int i = 0; i< 26; i++) {
            if(c1[i] != c2[i])
                return false;
        }

        return true;
    }
}
