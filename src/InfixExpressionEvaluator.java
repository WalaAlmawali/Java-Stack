import java.util.Stack;
public class InfixExpressionEvaluator {
    public static void main(String[] args) {


    }

    public static double evaluate(String expression) {

        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        int i = 0;
        while (i < expression.length()) {
            char ch = expression.charAt(i);

            if (ch == '') {
                i++;
                continue;
            }

            if(isNumber(ch)){
                String str ="";
                while(i<expression.length() && (isNumber(expression.charAt(i)))){

                    str += expression.charAt(i);
                    i++;
                }
                double value = Double.parseDouble(str);
                operandStack.push(value);
                printStacks(operandStack,operatorStack);
                continue;;
            }
            if(ch == '('){
                operatorStack.push(ch);
            } else if (ch==')') {
                while(!operatorStack.isEmpty() && operatorStack.peek()!='('){
                    double a = operandStack.pop();
                    double b = operandStack.pop();
                    char op = operatorStack.pop();
                    operandStack.push(applyOperation(a,b,op));
                }
                operatorStack.pop();
            } else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek())>= getPrecedence(ch)){
                    double a = operandStack.pop();
                    double b = operandStack.pop();
                    char op = operatorStack.pop();
                    operandStack.push(applyOperation(a,b,op));

                }
                operatorStack.push(ch);
            }

            printStacks(operandStack,operatorStack);
        }

    }
    // Check if character is number or decimal
    public static boolean isNumber(char ch) {
        return Character.isDigit(ch) || ch == '.';
    }
    // Print stack contents
    private static void printStacks(Stack<Double> operandStack, Stack<Character> operatorStack) {
        System.out.println("Operands: " + operandStack);
        System.out.println("Operators: " + operatorStack);

    }
    // Apply arithmetic operation
    public static double applyOperation(double a, double b, char operator) {
        switch (operator) {
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


    }
// Get operator precedence
public static int getPrecedence(char operator) {
    switch (operator) {
        case '+':
        case '-': return 1;
        case '*':
        case '/':
        case '%': return 2;
        case '^': return 3;
    }
    return -1;
}
// Check if character is operator
public static boolean isOperator(char ch) {
    return ch == '+' || ch == '-' || ch == '*' ||
            ch == '/' || ch == '^' || ch == '%';

}



    }
