package problemSolving.interviewQuestions.miscQuestions.easy;

public class SwapNumbersUsingXOR {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// in XOR, we get one if both bits are different
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
