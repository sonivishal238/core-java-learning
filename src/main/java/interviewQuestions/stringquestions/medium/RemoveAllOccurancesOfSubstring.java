package interviewQuestions.stringquestions.medium;

import org.testng.annotations.Test;

public class RemoveAllOccurancesOfSubstring {

	@Test
	public void removeOccurrences() {
		String s = "axxxxyyyyb";
		String part = "xy";
		// Greedy algorithm, repetedly remove the left most occurance

		StringBuilder sb = new StringBuilder(s);
		int i;

		while((i = sb.indexOf(part)) != -1) {
			sb.delete(i, i+part.length());
		}

		System.out.println(sb);
	}
	
}
