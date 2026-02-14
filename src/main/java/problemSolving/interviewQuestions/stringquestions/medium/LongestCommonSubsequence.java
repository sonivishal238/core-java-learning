package problemSolving.interviewQuestions.stringquestions.medium;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "ace";
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		System.out.println(getLongestCommonSubsequence(c1, c2, 0, 0));

	}

	private static int getLongestCommonSubsequence(char[] str1, char[] str2, int i, int j) {
		
		if( i == str1.length || j == str2.length)
			return 0;
		
		int longestLength = 0;
		
		if(str1[i] == str2[j]) {
			longestLength = 1+getLongestCommonSubsequence(str1, str2, i+1, j+1);
		}
		
		else {
			longestLength = Math.max(getLongestCommonSubsequence(str1, str2, i+1, j), getLongestCommonSubsequence(str1, str2, i, j+1));
		}
		
		return longestLength;
	}

}
