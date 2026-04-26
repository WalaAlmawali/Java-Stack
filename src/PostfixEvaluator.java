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


            }


        }

    // Helper method to check if token is a number
    private static boolean isNumber(String token) {
        return token.matches("-?\\d+"); // supports negative numbers
    }


}


