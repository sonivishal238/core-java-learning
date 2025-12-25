package interviewQuestions.miscQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number = 1678564;
		System.out.println("Reverse number: " + reverseNumber(number));
	}
	
	static int reverseNumber(int number) {
		int reverse = 0;
		
		while(number > 0) {
			int rem = number%10;
			
			// This is to handle that the reversed number is within the integer range
			if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10)
				return -1;
			reverse = reverse*10 + rem;
			number/=10;
		}
		
		return reverse;
	}
}
