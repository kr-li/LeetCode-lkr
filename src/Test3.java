import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xiaomei = new int[n];
        for (int i = 0; i < n; i++) {
            xiaomei[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] xiaotuan = new int[m];
        for (int i = 0; i < m; i++) {
            xiaotuan[i] = scanner.nextInt();
        }
        int ans = help(xiaomei, xiaotuan);
        System.out.println(ans);

    }

    public static int help(int[] xiaomei, int[] xiaotuan){
        Arrays.sort(xiaomei);
        int maxScore = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < xiaomei.length; i++) {
            for (int j = 0; j < xiaotuan.length; j++) {
                if (xiaotuan[j] > xiaomei[i]){
                    count++;
                }
            }
            maxScore = Math.max(maxScore, count - xiaomei.length - i);
        }
        return maxScore*2;
    }
}
