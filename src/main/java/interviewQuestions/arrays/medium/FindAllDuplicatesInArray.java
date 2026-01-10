package interviewQuestions.arrays.medium;

import java.util.ArrayList;
import java.util.List;

/*
Leetcode problem
 */
public class FindAllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> duplicates = new ArrayList<>();

        /*
         * Condition hai ki saare numbers  jo hai 1-n ki range me hai and hume only duplicate nikalne hai
         * Number - 1 krke uska index find kr skte hai based on above condition and usko - 1 krke index nikal lo
         * then us index pe value ko negative bnaa do
         * agar same value vapis aayi to tum same index pe aaoge jaha value negative milegi
         * negative means vapis visit kraa hai, pehle already kr chuke ho, to wo value pair me hai, answer me store krva lo
         */
        for(int i = 0; i < len; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                duplicates.add(index + 1);
            }

            nums[index] = nums[index] * -1;
        }

        return duplicates;
    }



}
