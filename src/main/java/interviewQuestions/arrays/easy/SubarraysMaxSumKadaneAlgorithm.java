package interviewQuestions.arrays.easy;

public class SubarraysMaxSumKadaneAlgorithm {

    public static void main(String[] args) {
        int arr[] = {1, 8, -8, 20, 10, 20};

        int maxSum = arr[0];
        int currentSum = arr[0];

        for( int i = 1 ; i < arr.length; i++) {
            if(arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
            }

            else {
                currentSum += arr[i];
            }

            if(maxSum < currentSum) {
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);
    }
}
