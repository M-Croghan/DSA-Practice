package problem_solving.blind75;

import java.util.HashMap;

public class ContainsDuplicate {
    // Inefficient O(n^2) Quadratic
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            int dupe = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == dupe){
                    return true;
                }
            }
        }
        return false;
    }


    // HashMap O(n) Linear
    public boolean containsDuplicate2(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap();
        for (int i = 0; i < nums.length; i++){
            if (hm.containsKey(nums[i])){
                return true;
            }
            else{
                hm.put(nums[i], true);
            }
        }
        return false;
    }
}
