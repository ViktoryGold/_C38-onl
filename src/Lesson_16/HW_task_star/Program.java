package Lesson_16.HW_task_star;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        String[] testCases = {
                "()","[()]","{[()]}","([{{[(())]}}])","{{[]()}}}}","{[(])}"
        };
        for (String test : testCases) {
            System.out.println("\"" + test + "\" -> " + isBalanced(test));
        }
    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
