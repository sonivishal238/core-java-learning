package interviewQuestions.patterns;

import org.testng.annotations.Test;

public class Patterns {

    @Test
    public void pattern1() {
        /*
         1234
         1234
         1234
         1234
         */

        int row = 4, column = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    @Test
    public void pattern2() {
        /*
           1
          121
         12321
        1234321
         */

        int row = 4, column = row*2 - 1;
        int k;
        for (int i = 1; i <= row; i++) {
            k = 1;
            for (int j = 1; j <= column; j++) {
                if(j >= row+1 - i && j <= row-1 + i) {
                    System.out.print(k);
                    if(j < row) k++;
                    else k--;
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
