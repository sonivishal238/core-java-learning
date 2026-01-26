package interviewQuestions.stringquestions.medium;

public class OneStringHasPermutationOfSecond {

	public static void main(String[] args) {
		
		System.out.println(checkInclusion("ba", "zcdcabd"));
	}
	
	static boolean checkInclusion(String s1, String s2) {
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int count1[] = new int[26];
		
		// Store the count of each character from the test string which needs to be search
		for(int i = 0; i < c1.length; i++) {
			int index = c1[i] - 'a';
			count1[index]++;
		}
		
		int i = 0;
		int windowSize = s1.length();
		int count2[] = new int[26];
		
		// Check if permutation of s1 is available in the very first window/place
		while( i < windowSize && i < s2.length()) {
			int index = c2[i] - 'a';
			count2[index]++;
			i++;
		}
		
		// If found at first place then return true, and do not process further
		if(isEqual(count1, count2)) {
			return true;
		}
		
		// Else keep traversing the window, keep storing the count of new next characters 
		// and keep removing the count of old character (left most one)
		while(i < s2.length()) {
			char newChar = c2[i];
			int index = newChar - 'a';
			count2[index]++;
			
			char oldChar = c2[i - windowSize];
			index = oldChar - 'a';
			count2[index]--;
			i++;
			
			if(isEqual(count1, count2))
				return true;
		}
		
		return false;
		
	}
	
	static Boolean isEqual(int[] c1, int c2[]) {
		for(int i = 0; i< 26; i++) {
			if(c1[i] != c2[i])
				return false;
		}
		
		return true;
	}

}
