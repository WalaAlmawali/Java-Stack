import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args){
        String str1= "hello";
        System.out.println(reverseString(str1));


    }
    public static String reverseString(String str) {

        if (str.isEmpty()) {
            return "";
        }

        if(str == null){
            return "null";
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        String reversedStr = "";

        while (!stack.isEmpty()){
            reversedStr+= stack.pop();
        }

        return reversedStr;
    }

    public static boolean isPalindrome(String str){
        if (str == null) {
            return false;
        }

        String cleanedString = str.replaceAll("\\s+","").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char ch : cleanedString.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : cleanedString.toCharArray()) {
           if(ch!= stack.pop()){
               return false;
           }
        }


    }

}
