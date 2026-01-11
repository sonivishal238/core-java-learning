package interviewQuestions.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;

public class CookingNinjas {

	public static void main(String[] args) {
		ArrayList<Integer> ranks = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		
		System.out.println("Answer is : " + getValue(ranks, 11));
	}
	
	static int getValue(ArrayList<Integer> ranks, int noOfDishes) {
		
        int s = 1;
        int e = Integer.MAX_VALUE; // Upper bound estimation
        
        int mid;
        int ans = -1;
        
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (isPossibleSolution(ranks, noOfDishes, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        
        return ans;
    }

    private static boolean isPossibleSolution(ArrayList<Integer> ranks, int noOfDishes, int mid) {
        int totalDishes = 0;
        
        // Iterate through each cook's rank
        for (int rank : ranks) {
            int time = 0;  // Time taken by the current cook
            int dishes = 0;  // Number of dishes prepared by the current cook
            int increment = rank;  // Time increment for the next dish
            
            // Calculate the number of dishes this cook can prepare within `mid` minutes
            while (time + increment <= mid) {
                dishes++;
                time += increment;  // Update the total time
                increment += rank;  // Update the time required for the next dish
            }
            
            // Add the dishes prepared by this cook to the total count
            totalDishes += dishes;
            // If the total dishes prepared meets or exceeds the required number of dishes, return true
            if (totalDishes >= noOfDishes) {
                return true;
            }
        }
        
        // After checking all cooks, return whether the total dishes prepared is sufficient
        return totalDishes >= noOfDishes;
    }

}
