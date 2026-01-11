package interviewQuestions.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class PaintersPartitionProblem {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(
				
				List.of(5,5,5,5));
		System.out.println("Answer is : " + getValue(list, list.size(), 2));
	}
	
	static int getValue(ArrayList<Integer> list, int size, int noOfPainters) {
		
		int s = 0, e = 0;
		
		for(int val: list) {
			e+=val;
		}
		
		int mid = s + (e-s)/2;
		int ans = -1;
		
		while(s <= e) {
			if(isPossibleSolution(list, size, noOfPainters, mid)) {
				ans = mid;
				e = mid - 1;
			}
			
			else {
				s = mid + 1;
			}
			
			mid = s + (e-s)/2;
		}
		
		return ans;
	}

	
	private static boolean isPossibleSolution(ArrayList<Integer> list, int size, int noOfPainters, int mid) {
		
		int painterCount = 1;
		int boardCount = 0;
		
		for(int i = 0; i < size; i++) {
			if(boardCount+list.get(i) <= mid) {
				boardCount+=list.get(i);
			}
			
			else {
				painterCount++;
				if(painterCount > noOfPainters || list.get(i) > mid) {
					return false;
				}
				
				boardCount = 0;
				boardCount = list.get(i);
			}
		}
		return true;
	}

}
