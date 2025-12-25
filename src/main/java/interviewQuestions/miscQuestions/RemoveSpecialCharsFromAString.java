package interviewQuestions.miscQuestions;

public class RemoveSpecialCharsFromAString {
    public static void main(String[] args) {
        String input = "snjxcbsjxnjsxn 686767676 &^&%$#*^*(&*^*^&^&*&*&* ABHBHBHXWB";

        // 1. Using regex:
        System.out.println(input.replaceAll("[^a-zA-Z0-9]",""));

        // 2. using String builder
        StringBuilder builder = new StringBuilder();

        for(char c : input.toCharArray()) {
            if( (c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >='0' && c <= '9')) {
                builder.append(c);

            }
        }

        System.out.print(builder.toString());
    }
}
