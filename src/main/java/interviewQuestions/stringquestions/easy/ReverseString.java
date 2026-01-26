package interviewQuestions.stringquestions.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseUsingStack("abcd")); // dcba
    }

    static String reverseUsingStack(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void reverseUsingArray() {

        String str = "Vishal";
        char[] array = str.toCharArray();

        for(int left = 0, right = array.length -1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        System.out.println(new String(array));
    }
}
