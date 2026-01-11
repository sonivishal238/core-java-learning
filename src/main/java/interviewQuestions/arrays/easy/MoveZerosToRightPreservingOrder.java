package interviewQuestions.arrays.easy;

import org.testng.annotations.Test;

public class MoveZerosToRightPreservingOrder {

    @Test
    public void solution(){
        int[] arr = {0, 2, 0, 1, 2, 4, 0, 8, 0, 9, 0, 89, 11, 0, 56};

        int nonZero =0;

        for(int i =0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[nonZero];
                arr[nonZero] = arr[i];
                arr[i] = temp;
                nonZero++;

            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
