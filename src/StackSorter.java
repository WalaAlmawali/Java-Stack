import java.util.Stack;
public class StackSorter {
    public static void main(String[] args) {



    }


    public static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()){
            int current = stack.pop();

            while(!tempStack.isEmpty() && tempStack.peek()< current){

                stack.push(tempStack.pop());
            }

        }

    }


}
