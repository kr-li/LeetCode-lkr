package 双指针遍历;

public class Leetcode209 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Leetcode209 l = new Leetcode209();
        System.out.println(l.minSubArrayLen(11, arr));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while (end < nums.length){
            sum += nums[end];
            while (sum >= target){
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end--;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
