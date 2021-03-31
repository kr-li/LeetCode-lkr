package 双指针遍历;

public class Leetcode11 {
    public int maxArea(int[] height){
        int ans = 0;
        if (height.length < 2) return ans;
        int left = 0, right = height.length - 1;
        while (left < right){
            ans = Math.max(ans, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
