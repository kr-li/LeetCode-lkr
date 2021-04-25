package 数字相关;

public class Leetcode9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int first = x;
        int reverseNum = 0;
        while (x > 0){
            int last = x % 10;
            x /= 10;
            reverseNum = 10 * reverseNum + last;
        }
        return reverseNum == first;
    }
}
