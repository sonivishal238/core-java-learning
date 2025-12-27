package interviewQuestions.stack;

import java.util.Stack;

public class CheckIfParenthesisAreBalanced {

	public static void main(String[] args) {
//		String str = "()[]{}";
        String str = "{[()]}";
        System.out.println(balanced(str));
	}

	static String balanced(String str) {
		char[] arr = str.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : arr) {
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			
			else {
				if(stack.isEmpty()
						||
						!isMatchingPair(stack.pop(), c)) {
					return "Not balanced";
				}
			}
			
		}
		
		return stack.isEmpty() ? "balanced" : "Not balanced";
	}
	
	private static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')')
				|| (open == '[' && close == ']')
				|| (open == '{' && close == '}');
	}

}
