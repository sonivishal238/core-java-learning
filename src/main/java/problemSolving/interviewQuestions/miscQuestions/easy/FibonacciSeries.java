package problemSolving.interviewQuestions.miscQuestions.easy;

import org.testng.annotations.Test;

public class FibonacciSeries {
    @Test
    public void printFibUptoANumber() {
        int range = 20;

        int first = 0, second = 1, next;

        for(int i = 0; i < range; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
