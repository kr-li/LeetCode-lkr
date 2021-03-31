package 双指针遍历;

import java.util.Arrays;

public class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right){
                int sum = nums[0] + nums[1] + nums[nums.length-1];
                if (Math.abs(ans - target) > Math.abs(sum - target)){
                    ans = sum;
                }
                if (sum > target){
                    right--;
                }
                else if (sum < target){
                    left++;
                }
                else{
                    return ans;
                }
            }
        }
        return ans;
    }
}
