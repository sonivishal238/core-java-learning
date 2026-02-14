package problemSolving.DSApatterns.twoPointers;

import org.testng.annotations.Test;

public class MoveZerosToRightPreservingOrderOfNonZeros {

    @Test
    public void solution(){
        int[] arr = {0, 2, 0, 1, 2, 4, 0, 8, 0, 9, 0, 89, 11, 0, 56};

        int positionOfLastNonZero =0;

        for(int i =0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[positionOfLastNonZero];
                arr[positionOfLastNonZero] = arr[i];
                arr[i] = temp;
                positionOfLastNonZero++;

            }
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
