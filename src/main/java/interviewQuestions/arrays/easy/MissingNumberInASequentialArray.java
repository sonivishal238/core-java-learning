package interviewQuestions.arrays.easy;

public class MissingNumberInASequentialArray {
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,7,8,9,10};

        int actual = 0;
        System.out.println("Length: " + array.length);
        for(int i=0; i<array.length; i++) {
            actual = actual + array[i];
        }

        int expected = 0;
        System.out.println("Actual: " + actual);

        for(int j = 1; j<=array.length+1; j++) {
            expected = expected + j;
        }

        System.out.println("Expected: " + expected);
        System.out.println("Missing: " + (expected-actual));
    }
}
