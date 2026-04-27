import java.util.Stack;
public class MinStack {
    public static void main(String[] args) {



    }
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int value){

        mainStack.push(value);

        if (minStack.isEmpty() || value<= minStack.peek()){
            minStack.push(value);
        }

    }

    public void pop(){


    }



}
