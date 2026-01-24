package interviewQuestions.arrays.medium;

import org.testng.annotations.Test;

public class SortArrayWithZeroOneAndTwo {

    @Test
    public void solution() {
        int arr[] = {0,0,1,2,1,1,1,2,0,2,0,0,0,2,1,0};

        int start = 0, mid = 0, end = arr.length - 1;

        while(mid <= end) {
            if(arr[mid] == 0) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;

                start++;
                mid++;
            }else if(arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;

                end--;
            }
        }

        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
