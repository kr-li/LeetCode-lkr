package 双指针遍历;

public class Leetcode209 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Leetcode209 l = new Leetcode209();
        System.out.println(l.minSubArrayLen(11, arr));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return 1;
            int j = i + 1;
            int sum = nums[i];
            while (j < nums.length){
                sum += nums[j];
                if (sum > target) {
                    break;
                }
                if (sum == target) {
                    ans = Math.min(ans, j - i + 1);
                }
                j++;
            }
        }
        return ans == nums.length ? 0 : ans;
    }
}
