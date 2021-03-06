package Hash相关;

import java.util.HashMap;

public class Leetcode1 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                return new int[] {hashMap.get(nums[i]), hashMap.get(target- nums[i])};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
