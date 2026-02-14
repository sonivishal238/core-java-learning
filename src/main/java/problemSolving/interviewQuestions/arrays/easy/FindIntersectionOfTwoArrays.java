package problemSolving.interviewQuestions.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionOfTwoArrays {

	public static void main(String[] args) {
		int first[] = {1,2,2,3,3,4,5,6,7};
		int second[] = {2,3,3,6,7, 10, 11};
		
		findIntersection(first, second);

	}

	private static void findIntersection(int[] first, int[] second) {
		
		int n = first.length, m = second.length, i = 0, j = 0;
		List<Integer> ans = new ArrayList<Integer>();
		while(i < n && j < m) {
			if(first[i] == second[j]) {
				ans.add(first[i]);
				i++;
				j++;
			}
			else if(first[i] < second[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		
		if(ans.size() == 0)
			System.out.println(-1);
		else
			System.out.println(ans);
		
	}

}
