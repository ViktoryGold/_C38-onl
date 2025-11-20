package Lesson_11.HW_task_star_star_star;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = scanner.nextLine();
        scanner.close();
        try {
            double result = calculate(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double calculate(String expr) throws Exception {
        expr = expr.replaceAll("\\s+", "");
        return parseExpression(new StringTokenizer(expr, "+-*/()", true));
    }
    private static double parseExpression(StringTokenizer tokens) throws Exception {
        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();

            if (isNumber(token)) {
                values.push(Double.parseDouble(token));
            } else if (token.equals("(")) {
                ops.push('(');
            } else if (token.equals(")")) {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    applyOp(values, ops);
                }
                if (ops.isEmpty()) throw new Exception("Несбалансированные скобки");
                ops.pop();
            } else if (isOperator(token)) {
                char op = token.charAt(0);
                while (!ops.isEmpty() && hasPrecedence(op, ops.peek())) {
                    applyOp(values, ops);
                }
                ops.push(op);
            } else {
                throw new Exception("Неизвестный символ: " + token);
            }
        }
        while (!ops.isEmpty()) {
            applyOp(values, ops);
        }
        if (values.size() != 1) throw new Exception("Ошибка вычисления");
        return values.pop();
    }
    private static void applyOp(Stack<Double> values, Stack<Character> ops) throws Exception {
        if ((values.size() < 2 || ops.isEmpty())) throw new Exception("Ошибка стека");

        double b = values.pop(), a = values.pop();
        char op = ops.pop();

        switch (op) {
            case '+': values.push(a + b);
                break;
            case '-': values.push(a - b);
                break;
            case '*': values.push(a * b);
                break;
            case '/':
                if (b == 0) throw new Exception("Деление на ноль");
                values.push(a / b);
                break;
            default: throw new Exception("Неизвестная операция: " + op);
        }
    }
    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isOperator(String s) {
        return s.length() == 1 && "+-*/".indexOf(s.charAt(0)) != -1;
    }
    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(') {
            return false;
        }
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }
}
