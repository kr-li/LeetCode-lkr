import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = 0;
        while (num > 0){
            if ((num & 1) == 1){
                ans++;
            }
            num = num >>> 1;
        }
        System.out.println(ans);
    }
}
