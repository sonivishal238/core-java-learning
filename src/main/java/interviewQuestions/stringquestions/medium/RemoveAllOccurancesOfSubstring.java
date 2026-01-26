package interviewQuestions.stringquestions.medium;

public class RemoveAllOccurancesOfSubstring {

	public static void main(String[] args) {
		
		String s = "abcdefghabjlnfabllmfioab";
		String part = "ab";
		
		System.out.println(s.replaceAll(part, ""));
	}

	
}
