package interviewQuestions.miscQuestions;

public class NthOccurrenceOfACharacterFromAString {
    public static void main(String[] args) {
        String name = "Vishal soni is going to find s in this string";
        char key = 'z';
        int n = 1;
        int index = -1; // represents occurrence not found

        for(int i = 0; i < n; i++) {
            index = name.indexOf(key, index + i); // The second params tells the starting index

            if(index == -1) {
                System.out.println("Not found");
            }

        }


        System.out.println(index);

    }
}
