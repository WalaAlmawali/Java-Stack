import java.util.Stack;
public class InfixToPostfixConverter {
    public static void main(String[] args) {


    }

    Stack<Character> operatorsStack = new Stack<>();

    // Check if character is an operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^';
    }

    // Get operator precedence
    public static int getPrecedence(char op) {
        switch (op) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }


    // Apply arithmetic operation
    public static double applyOperation(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            case '%': return a % b;
            case '^': return Math.pow(a, b);
        }
        return 0;
    }

    public static String infixToPostfix(String infix) {

        Stack<Character> stack = new Stack<>();
        String postfix = "";



        // Remove spaces
        infix = infix.replaceAll("\\s+", "");
        System.out.println("\nConverting: " + infix);

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Handle numbers (multi-digit & decimal)
            if(Character.isDigit(ch) || ch == '.'){

                while (i < infix.length() &&
                        (Character.isDigit(infix.charAt(i)) || infix.charAt(i) == '.')) {
                    postfix += infix.charAt(i);
                    i++;
                }

                postfix += " ";
                i--;
            }
            // Opening parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }
            // Closing parenthesis
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop() + " ";
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    throw new RuntimeException("Mismatched parentheses");
                }
        }
            // Operator
            else if (isOperator(ch)) {

                // Handle unary minus
                if (ch == '-' && (i == 0 || infix.charAt(i - 1) == '(')) {
                    postfix += "0 ";
                }

                while (!stack.isEmpty() &&
                        getPrecedence(stack.peek()) >= getPrecedence(ch)) {
                    postfix += stack.pop() + " ";
                }
                stack.push(ch);
            }

            else {
                throw new RuntimeException("Invalid character: " + ch);
            }




    }

    }
