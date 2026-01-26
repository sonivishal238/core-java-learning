package interviewQuestions.stringquestions.easy;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String res = removeAdjacentDuplicatesUsingStack("aazbbby");
		System.out.println(res);

	}
	
    public static String removeAdjacentDuplicatesUsingStack(String str) {
        Stack<Character> stack = new Stack();
        for (char c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
