package interviewQuestions.arrays.easy;

import java.util.Arrays;

public class SwapAlternates {
    public static void main(String[] args) {
        int evenSizedArray[] = {5,2,9,4,7,6,1,0};
        int oddSizedArray[] = {11, 33, 9, 76, 43};
        swapAlternate(evenSizedArray);
        Arrays.stream(evenSizedArray).forEach(num -> System.out.print(num + " "));
        System.out.println();

        swapAlternate(oddSizedArray);
        Arrays.stream(oddSizedArray).forEach(num -> System.out.print(num + " "));
    }

    static void swapAlternate(int arr[]) {
        for(int i = 0; i < arr.length; i+=2) {
            if(i+1 < arr.length) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
