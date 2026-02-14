package problemSolving.interviewQuestions.arrays.medium;

import org.testng.annotations.Test;

public class FirstAndLastPositionOfElementInArray {
    @Test
    public void solution() {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 8, 9 };

        int first = find(arr, 5, true);
        int last = find(arr, 5, false);
        System.out.println("first:" + first);
        System.out.println("last:" + last);
        System.out.println("Total:" + (last+1 - first));
    }

    int find(int[] arr, int key, boolean isFirst) {
        int start = 0, end = arr.length - 1, mid = start + (end-start)/2;
        int answer = -1;

        while(start < end) {
            if(arr[mid] == key) {
                answer = mid;
                if(isFirst) end = mid - 1;
                else start = mid + 1;

            } else if(key < arr[mid]) {
                end = mid - 1;
            } else if(key > arr[mid]) {
                start = mid + 1;
            }

            mid = start + (end-start)/2;
        }

        return answer;
    }

}
