package problemSolving.interviewQuestions.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwoArrays {
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int i = n-1;
        int j = m-1;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;

        while(i>=0 && j>=0){
            
            int sum = a[i] + b[j] + carry;

            // real life me carry ese hi nikalta hai
            carry = sum/10;
            
            // real life me sum ese hi nikalta hai, krke dekh
            sum = sum%10;
            ans.add(sum);
            i--;
            j--;
        }

        while(i>=0){
            int sum = a[i] + carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            i--;        
        }

        while(j>=0){
            int sum = b[j] + carry;
            carry = sum/10;
            sum = sum%10;
            ans.add(sum);
            j--;        
        }

        if(carry != 0){
            ans.add(carry);
        }

        Collections.reverse(ans);
        int[] result = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++){
            result[k] = ans.get(k);
        }

        return result;
    }
}
