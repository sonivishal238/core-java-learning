package interviewQuestions.miscQuestions.easy;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsInAString {

    @Test(description = "This test considers character casing as well")
    public void duplicateCharsUsingMap() {
        String str = "Test for duplicate characters in string";

        char[] arr = str.replaceAll(" ", "").toCharArray();

        Map<Character, Integer> results = new HashMap<>();

        for(char c : arr) {
            if(!results.containsKey(c)) {
                results.put(c, 1);
            }
            else {
                results.put(c, results.get(c) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : results.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }

    @Test
    public void usingArrayWithoutCasing() {
        String str = "Test for duplicate characters in string";
        int[] counter = new int[26];

        for (char ch : str.toLowerCase().replaceAll("[^a-z]", "").toCharArray()) {
            counter[ch - 'a']++;
        }

        for(int i = 0; i < counter.length; i++) {
            if(counter[i] > 1) {
                System.out.println((char)(i + 'a') + ": " + counter[i]);
            }
        }
    }
}
