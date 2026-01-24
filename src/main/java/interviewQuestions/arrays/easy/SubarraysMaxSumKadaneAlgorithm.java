package interviewQuestions.arrays.easy;

public class SubarraysMaxSumKadaneAlgorithm {

    public static void main(String[] args) {
        int arr[] = {1, 8, -8, 5, -10, 2};

        int maxSum = arr[0];
        int currentSum = arr[0];

        for( int i = 1 ; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println(maxSum);
    }
}
