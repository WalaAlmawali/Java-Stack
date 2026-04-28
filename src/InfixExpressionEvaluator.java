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

            }

        }

    }
    // Check if character is number or decimal
    public static boolean isNumber(char ch) {
        return Character.isDigit(ch) || ch == '.';
    }

}



    }
