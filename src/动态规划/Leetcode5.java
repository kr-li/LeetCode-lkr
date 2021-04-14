package 动态规划;

public class Leetcode5 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        int maxLen = 1;
        int start = 0;

        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(j)){
                    if (j - i < 3){
                        dp[i][j] = true;
                    }
                    else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                else{
                    dp[i][j] = false;
                }

                if (dp[i][j]){
                    int currentLen = j - i + 1;
                    if (currentLen > maxLen){
                        maxLen = currentLen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
