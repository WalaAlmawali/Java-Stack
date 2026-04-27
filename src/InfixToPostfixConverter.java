import java.util.Stack;
public class InfixToPostfixConverter {
    public static void main(String[] args) {


    }

    Stack<Character> operatorsStack = new Stack<>();

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


            }


        }



    }

    }
