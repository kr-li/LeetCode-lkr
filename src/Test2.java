import java.util.Scanner;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String length = scanner.next();
        String num = scanner.next();
        int ans1 = help1(num);
        int ans2 = help2(num);
        System.out.println(Math.max(ans1,ans2));
    }

    public static int help1(String num){
        char[] numCharArr = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < numCharArr.length; i++) {
            if (numCharArr[i] == '1' && i != numCharArr.length - 1 && numCharArr[i+1] == '1' && !stack.isEmpty()){
                stack.pop();
                i++;
            }
            else{
                stack.push(numCharArr[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        int zeroCount = 0;
        int oneCount = 0;
        String newNum = sb.toString();
        for (int i = 0; i < newNum.length(); i++) {
            if (newNum.charAt(i) == '0'){
                zeroCount++;
            }
            if (newNum.charAt(i) == '1'){
                oneCount++;
            }
        }

        int ans1 = Math.abs(zeroCount - oneCount);
        return ans1;
    }

    public static int help2(String num){
        char[] numCharArr = num.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < numCharArr.length; i++) {
            if (numCharArr[i] == '0' && i != numCharArr.length - 1 && numCharArr[i+1] == '0' && !stack.isEmpty()){
                stack.pop();
                i++;
            }
            else{
                stack.push(numCharArr[i]);
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        int zeroCount = 0;
        int oneCount = 0;
        String newNum = sb.toString();
        for (int i = 0; i < newNum.length(); i++) {
            if (newNum.charAt(i) == '0'){
                zeroCount++;
            }
            if (newNum.charAt(i) == '1'){
                oneCount++;
            }
        }

        int ans1 = Math.abs(zeroCount - oneCount);
        return ans1;
    }
}
