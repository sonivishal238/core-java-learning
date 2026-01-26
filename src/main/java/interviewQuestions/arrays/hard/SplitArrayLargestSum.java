package interviewQuestions.arrays.hard;

public class SplitArrayLargestSum {
    public int splitArray(int[] arr, int noOfSubArrays) {
        int start = 0, end = 0, arraySize = arr.length, mid, ans = -1;

        for(int i = 0; i < arraySize; i++){
            end+=arr[i];
        }

        mid = start + (end - start)/2;

        while(start <= end){
            if(isPossibleSolution(arr, arraySize, noOfSubArrays, mid)){
                ans = mid;
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }

            mid = start + (end - start)/2;
        }

        return ans;
    }

    private static boolean isPossibleSolution(int[] arr, int arraySize, int noOfSubArrays, int mid){
        int valuesSum = 0;
        int subCount = 1;

        for(int i = 0; i < arraySize; i++){
            if(valuesSum + arr[i] <= mid){
                valuesSum+= arr[i];
            }

            else{
                subCount++;

                if(subCount > noOfSubArrays || arr[i] > mid){
                    return false;
                }

                valuesSum = 0;
                valuesSum = arr[i];
            }
        }

        return true;
    }
}
