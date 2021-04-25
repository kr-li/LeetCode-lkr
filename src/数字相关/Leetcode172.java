package 数字相关;

public class Leetcode172 {

    public int trailingZeroes(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0){
                if (num % 5 == 0){
                    count++;
                    num /= 5;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
