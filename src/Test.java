import 树的遍历.TreeNode;

import java.util.LinkedHashMap;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){

        Test t = new Test();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int s = t.result(arr, 9);
        System.out.println(s);
    }

    public int result(int[] stones, int m){
        int[] dp = new int[m];
        dp[0] = stones[0];
        dp[1] = stones[1];
        dp[2] = stones[2];
        dp[3] = stones[3];
        dp[4] = stones[4];
        dp[5] = stones[5];
        for (int i = 6; i < m; i++) {
            dp[i] = stones[i] + Math.min(Math.min(dp[i-3], dp[i-4]), dp[i-5]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 6; i < m; i++) {
            min = Math.min(dp[i], min);
        }
        return min;
    }
}
