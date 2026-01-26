package interviewQuestions.stringquestions.easy;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		
		System.out.println(getMaxOccurringChar("hithisisvishallllaaaahhhh"));
	}

	
	static char getMaxOccurringChar(String str) {
		int arr[] = new int[26];
		char[] cArray = str.toCharArray();
		
		// Creating the array of count character
		for(int i = 0; i < str.length(); i++) {
			char ch = cArray[i];
			
			// lower case
			int numberAsIndex = 0;
			if(ch >= 'a' && ch <= 'z') {
				numberAsIndex = ch - 'a';
			}
			//upper case
			else {
				numberAsIndex = ch-'A';
			}
			
			arr[numberAsIndex]++;
		}
		
		int maxi = -1, ans = 0;
		for(int i=0; i < str.length(); i++) {
			if(maxi < arr[i]) {
				ans = i;
				maxi = arr[i];
			}
		}
		
		return (char) ('a'+ans);
	}
}
