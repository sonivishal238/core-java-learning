package problemSolving.interviewQuestions.arrays.medium;

public class MoveNegativesToTheStartOfArray {
    public static void moveNegativesToFront(int[] numbers) {

        int nextNegativePosition = 0;

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {
            if (numbers[currentIndex] < 0) {

                int negativeValue = numbers[currentIndex];

                // Shift elements to the right to make space
                for (int shiftIndex = currentIndex;
                     shiftIndex > nextNegativePosition;
                     shiftIndex--) {

                    numbers[shiftIndex] = numbers[shiftIndex - 1];
                }

                numbers[nextNegativePosition] = negativeValue;
                nextNegativePosition++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, -1, 4, -5, 2, -6};

        moveNegativesToFront(numbers);

        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}
