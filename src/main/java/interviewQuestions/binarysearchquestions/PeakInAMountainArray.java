package interviewQuestions.binarysearchquestions;

public class PeakInAMountainArray {
	public int peakIndexInMountainArray(int[] arr) {
		int len = arr.length;
		if (arr.length == 3)
			return 1;

		int left = 0, right = len - 1;
		int mid = left + (right - left) / 2;

		while (left < right) {
			if (arr[mid] < arr[mid + 1])
				left = mid + 1;

			else
				right = mid;

			mid = left + (right - left) / 2;
		}

		return left;
	}
}
