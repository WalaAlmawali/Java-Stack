import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args){


    }

    public static boolean isBalanced(String expression) {
        Stack<Character> openingSymbolsStack = new Stack<>();

        if (expression.isEmpty()) {
            System.out.println("Empty expression");
            return true;
        }

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                openingSymbolsStack.push(ch);
            }  else if (ch == ')' || ch == ']' || ch == '}') {

                if (openingSymbolsStack.isEmpty()) {
                    return false;
                }
                char top = openingSymbolsStack.peek();

            }


            }




        return true;

    }

    }
