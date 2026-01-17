package interviewQuestions.stringquestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {
    static String reverse(String s) {
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

    public static void main(String[] args) {
        System.out.println(reverse("abcd")); // dcba
    }
}
