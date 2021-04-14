package 动态规划;

public class Leetcode53 {

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = dp[i - 1] + nums[i];
            dp[i] = Math.max(nums[i], temp);
            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }

    /**
     * 贪心算法
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums){
        int sum = nums[0];
        int temp = sum;
        for (int i = 1; i < nums.length; i++) {
            temp = temp + sum;
            if (temp >= sum){
                sum = temp;
            }
            else if (temp < 0){
                temp = 0;
            }
            if (nums[i] > sum){
                temp = nums[i];
                sum = nums[i];
            }
        }
        return sum;
    }
}
