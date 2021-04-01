package 双指针遍历;

public class Leetcode121 {

    public static void main(String[] args) {
        int[] arr = {1,5,2,7};
        Leetcode121 leetcode121 = new Leetcode121();
        System.out.println(leetcode121.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int currentMinPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > currentMinPrice){
                dp[i] = Math.max(dp[i-1], prices[i] - currentMinPrice);
            }
            else {
                dp[i] = dp[i-1];
                currentMinPrice = prices[i];
            }
        }

        return dp[dp.length - 1];
    }
}
