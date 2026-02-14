package problemSolving.linearDSAs;

import java.util.Arrays;

public class ArraysOperations {

    public static void main(String[] args) {
        int arr[] = {0, 1, 2,3, 4, 5};
        insertionInAnArrayAtASpecificIndex(arr, 3, 20);
    }

    public static void insertionInAnArrayAtASpecificIndex(int[] arr, int index, int value) {
        /*
        1. Case when array has empty places
        2. When it does not have any empty space
         */

        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = value;

        System.out.println("array after inserting " + value + " at index " + index + " ");
        printArray(arr);
    }

    static void printArray(int arr[]) {
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
