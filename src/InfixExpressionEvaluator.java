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

        }

    }
    // Check if character is number or decimal
    public static boolean isNumber(char ch) {


    }

}



    }
