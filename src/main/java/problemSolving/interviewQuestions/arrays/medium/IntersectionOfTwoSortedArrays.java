package problemSolving.interviewQuestions.arrays.medium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {

    @Test
    public void solution() {
        int[] arr1 = {1,2,3,4, 4, 5,6,7, 9};
        int[] arr2 = {1, 2, 3, 4, 7, 9};
        List<Integer> results = new ArrayList<>();

        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                results.add(arr1[i]);
                i++; j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        results.forEach(num -> System.out.print(num+" "));
    }
}
