package interviewQuestions.arrays.easy;

import org.testng.annotations.Test;

public class FindOnlyDuplicateValueFromArray {

    @Test
    public void test() {
        int[] arr = {1, 4, 1, 3, 4, 7, 3};

        int result = 0;

        for(int num : arr) {
            result ^= num;
        }

        System.out.print("Only unique element is: " + result);
    }
}
