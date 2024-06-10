import java.util.*;
public class PostFixEvaluate
{
    public static String infixToPostfix(String expression)
    {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) 
        {
            char ch = expression.charAt(i);
            if (Character.isLetterOrDigit(ch))
                result.append(ch);
            else if (ch == '(')
                stack.push(ch);
            else if (ch == ')') 
            {
                while (!stack.isEmpty() && stack.peek() != '(') 
                {
                    result.append(stack.pop());
                }
                stack.pop();
            } 
            else 
            {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                {
                    result.append(stack.pop());
                }
                stack.push(ch); 
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static int evaluatePostfix(String expression)
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) 
        {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch))
                stack.push(ch - '0');
            else 
            {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
    private static int precedence(char operator) 
    {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        String infixExpression = "2+3/(2+4)*1/1-4";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}
