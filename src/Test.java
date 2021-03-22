import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        StringBuffer sb = new StringBuffer(num);
        int i = 0;
        String s = "0";
        for (; i < sb.length(); i++){
            if (sb.charAt(i) == '.'){
                s = sb.substring(i+1, i+2);
                break;
            }
        }
        if (Integer.parseInt(s) >= 5) {
            System.out.println(Integer.parseInt(sb.substring(0, i)) + 1);
        }
        else {
            System.out.println(Integer.parseInt(sb.substring(0, i)));
        }
    }
}
