package interviewQuestions.miscQuestions;

public class SmallestAndLargestNumberFromArray {
    public static void main(String[] args) {
        int numbers[] = {-9, 45, 2, 46, 90, 88, 66, 34};

        int smallest = numbers[0], largest = numbers[0];

        for(int num : numbers) {
            if(num < smallest) {
                smallest = num;
            }

            else if(num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest: "+ smallest);
        System.out.println("Largest: " + largest);
    }
}
