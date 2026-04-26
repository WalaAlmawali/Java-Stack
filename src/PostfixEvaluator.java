import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args){


    }
    public static int evaluatePostfix(String expression){

        if(expression == null || expression.isEmpty()){
            System.out.println("Empty expression");
        }

        Stack<Integer> stack = new Stack<>();

        String[] expressionElements = expression.split("");

        for(String element:expressionElements ){
            // check If element is a number
            if (isNumber(element)) {
                int num = Integer.parseInt(element);
                stack.push(num);  // push()

            } else if (isOperator(element)) {
                // Check if enough operands exist
                if (stack.size() < 2) {
                  System.out.println("Not enough operands for operator: " + element);
                }

                int b = stack.pop(); // pop()
                int a = stack.pop(); // pop()

                int result = applyOperator(a, b, element);

                stack.push(result); // push result


            }else {
                System.out.println("Invalid token: " + element);
            }


        }
        // Final result check
        int finalResult = stack.pop();

        // Clear stack after evaluation
        stack.clear(); // clear()

        return finalResult;

        }

    // Helper method to check if token is a number
    private static boolean isNumber(String token) {
        return token.matches("-?\\d+"); // supports negative numbers
    }

    // Helper method to check if token is an operator
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") ||
                token.equals("%");
    }

    // Apply operator to operands
    private static int applyOperator(int a, int b, String operator) {

        switch (operator) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                return a / b;

            case "%":
                if (b == 0) {
                    throw new ArithmeticException("Modulo by zero.");
                }
                return a % b;

            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }


}


