package interviewQuestions.miscQuestions.easy;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here s";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s')); // 1st occurrence of s
		System.out.println(str.indexOf('s', str.indexOf('s') + 1)); // 2nd occurrence of s
		
		System.out.println(str.concat(" concat"));
		
		// Swap two strings without 3rd variable
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping: ");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		// 1. append a and b:
		a = a+b; // HelloWorld
		
		// 2. Store initial string a in string b
		b = a.substring(0, a.length()-b.length());
		
		// 3. Store initial string b in String a
		a = a.substring(b.length());
		
		//.substring(0, a.length()-1);
		
		System.out.println("After swapping: ");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
