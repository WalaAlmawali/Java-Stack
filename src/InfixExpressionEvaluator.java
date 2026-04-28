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


                }
            }

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

}



    }
