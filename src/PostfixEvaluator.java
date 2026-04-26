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
            }


            }


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


}


