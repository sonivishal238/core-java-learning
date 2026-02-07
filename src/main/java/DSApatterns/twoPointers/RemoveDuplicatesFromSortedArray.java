package DSApatterns.twoPointers;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        System.out.print(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int length = arr.length;

        if(length == 1){
            return length;
        }

        int slow = 0, fast = 1;

        while(fast < length) {
            if(arr[fast] != arr[slow]) {
                arr[++slow] = arr[fast];
            }
            fast++;
        }

        return ++slow;
    }
}
