package 栈相关;

import java.util.Stack;

public class LeetCode20 {

    public boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(character);
            }
            else if (stack.peek() == ')' || stack.peek() == ']' || stack.peek() == '}'){
                return false;
            }
            else if (stack.peek() == '(' && character == ')') stack.pop();
            else if (stack.peek() == '[' && character == ']') stack.pop();
            else if (stack.peek() == '{' && character == '}') stack.pop();
            else stack.push(character);
        }
        return stack.isEmpty();
    }
}
