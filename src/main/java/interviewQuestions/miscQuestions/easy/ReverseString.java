package interviewQuestions.miscQuestions.easy;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Vishal";
		char[] array = str.toCharArray();

        for(int left = 0, right = array.length -1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        System.out.println(new String(array));
	}
}
