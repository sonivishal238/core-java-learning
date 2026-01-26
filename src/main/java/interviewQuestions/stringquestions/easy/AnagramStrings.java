package interviewQuestions.stringquestions.easy;

import org.testng.annotations.Test;

import java.util.Arrays;

public class AnagramStrings {

    @Test
    public void bruteForce() {
        /*
        Using sort and compare
         */

        String str1 = "vishal";
        String str2 = "shaivi";

        if(str1.length() != str2.length())
            System.out.println(false);

        else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2))
                System.out.println(true);
            else
                System.out.println(false);

        }
    }

    @Test
    public void optimizedUsingCounterAndCaseSensitive() {
        String str1 = "Listen!";
        String str2 = "siLent!";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] frequency = new int[256]; // ASCII size

        for(int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;   // for case insensitive it will be [char-'a']
            frequency[str2.charAt(i)]--;
        }

        boolean isAnagram = true;
        for (int count : frequency) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
