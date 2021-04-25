package 数字相关;

public class Leetcode7 {

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int ans = 0;

        while (x != 0){
            int last = x % 10;
            //判断是否 大于 最大32位整数
            if (ans>214748364 || (ans==214748364 && last>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (ans<-214748364 || (ans==-214748364 && last<-8)) {
                return 0;
            }


            ans = ans * 10 + last;
            x /= 10;
        }

        return ans;
    }
}
