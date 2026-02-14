package problemSolving.interviewQuestions.miscQuestions.easy;

public class ComplementOfNumber {

	public static void main(String[] args) {
		
		// Complement is changing 0 to 1 and 1 to 0 for any number in binary syatem
		/*
		 * n = 5 => 0000.........101 after changing 0000....010 => 2
		 * 
		 * ~5 => 1111......1 1 1 0 1 0 ab iska 0000....0 0 0 1 1 1 se end krvaade to answer ajayega 2
		 * means ~n se hamara kaam horha hai, if useless 1's hataa de to answer aajayega.
		 * Let say wo number mask hai
		 * Lecture 7, complement question
		 */

		int n = 5;
		int m = n;
		int mask = 0;
		while(m != 0) {
			// jab tak number ki value zero nahi hoti tab tak mask ko right shift krke or karo 1 se to mask mil jayega
			mask = (mask << 1) | 1; // left shift and then OR with 1
			m = m >> 1; // right shift
		}
		
		int complement = (~n) & mask;
		System.out.println(complement);
	}

}