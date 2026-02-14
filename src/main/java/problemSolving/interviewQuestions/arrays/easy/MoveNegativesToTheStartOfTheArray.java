package problemSolving.interviewQuestions.arrays.easy;

import org.testng.annotations.Test;

public class MoveNegativesToTheStartOfTheArray {

    @Test
    public void solution() {
        int arr[] = {1, 5, 3, -2, -6, 7, 48, -97, 35, 2};

        int[] temp = new int[arr.length];
        int index = 0;

        // Add negatives first
        for (int num : arr) {
            if (num < 0) temp[index++] = num;
        }

        // Add non-negatives
        for (int num : arr) {
            if (num >= 0) temp[index++] = num;
        }

        // Copy back
        System.arraycopy(temp, 0, arr, 0, arr.length);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
