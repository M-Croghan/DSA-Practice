package problem_solving.blind75;

import java.util.HashMap;

public class TwoSum {
    // Initial Inefficient approach: nested for-loops O(n^2) Quadratic Time
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // Using a HashMap to store the compliment O(n) Linear Time
    public int[] twoSum2(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++){
            if (hm.containsKey(target - nums[i])){
                indices[0] = i;
                indices[1] = hm.get(target - nums[i]);
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return indices;
    }
}
