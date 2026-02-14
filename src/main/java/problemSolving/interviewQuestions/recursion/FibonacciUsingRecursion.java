package problemSolving.interviewQuestions.recursion;

public class FibonacciUsingRecursion {

    public static void main(String[] args) {
        int range = 10;
        int maxValue = 30;
        for(int i = 0; i < range; i++) {
            int member = getNextFib(i);
//            if(member > maxValue)
//                break;   uncomment this to print less than a max value
            System.out.print( member + " ");
        }
    }

    static int getNextFib(int n) {
        if(n <= 1) {
            return n;
        }

        return getNextFib(n - 1) + getNextFib(n - 2);
    }

}
