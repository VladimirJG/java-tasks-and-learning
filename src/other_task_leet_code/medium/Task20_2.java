package other_task_leet_code.medium;

import java.util.Stack;

public class Task20_2 {
    public static void main(String[] args) {
        String s = "()[]{}";
        isValid(s);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char curr : s.toCharArray()) {
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), curr)) {
                stack.pop();
            } else {
                System.out.println(false);
                return false; // Invalid character or mismatched closing bracket
            }
        }

        return stack.isEmpty(); // If the stack is empty, all brackets were matched.
    }

    private static boolean isMatchingPair(char open, char close) {
        System.out.println(true);
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
