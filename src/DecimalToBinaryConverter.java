import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args){

        System.out.println(decimalToBinaryConverter(10));


    }

    public static String decimalToBinaryConverter(int decimalNumber){

        Stack<Integer> remainders = new Stack<>();
        int number = decimalNumber;

        while(number > 0){
            int remainder = number % 2;
            remainders.push(remainder);
            number = number/2;

        }

        String binary = "";

        while (!remainders.isEmpty()){
            binary+= remainders.pop();
        }

        return binary;
    }

    }
