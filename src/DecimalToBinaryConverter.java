import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args){

        System.out.println(decimalToBinaryConverter(10));


    }

    public static String decimalToBinaryConverter(int decimalNumber){
        if(decimalNumber == 0 ){
            return "";
        }

        if(decimalNumber < 0){
            return "Unsupported";
        }

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

    public static void displayConversionProcess(int decimal){

        if(decimal <= 0){
            System.out.println("No steps, Number is zero or negative");
        }

        Stack<Integer> remainders = new Stack<>();
        int number = decimal;

        while(number > 0){
            int remainder = number % 2;
            remainders.push(remainder);
            number = number/2;

            System.out.println("reminder = "+ remainder+ ", stack = " +remainders + "number " + number + "Divide 2 = "+ number);

        }
        String binary = "";

        while (!remainders.isEmpty()){
            binary+= remainders.pop();
        }

    }

    public static int binaryToDecimal(String binary) {

        if(binary == null || binary.isEmpty()){
            return 0;
        }

        int decimal = 0;
        int power = 0 ;
        for(int i = binary.length()-1; i>= 0; i--){


        }

    }

    }
