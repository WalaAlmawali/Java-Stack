import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args){

        String test1 =    "";
        System.out.println(isBalanced(test1));

        String test2 =    "(a+b)";
        System.out.println(isBalanced(test2));

        String test3 =    "{[a+b]*(c+d)}";
        System.out.println(isBalanced(test3));

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

                if (isMatchingPair(top, ch)) {
                    openingSymbolsStack.pop();
                }else {
                    return false;
                }

            }

            }
        if (openingSymbolsStack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    }
