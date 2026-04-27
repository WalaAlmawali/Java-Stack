import java.util.Stack;
public class MinStack {
    public static void main(String[] args) {

        MinStack stack= new MinStack();


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

        if(minStack.isEmpty()){
            System.out.println("Stack is empty!");
        }
        int removed = mainStack.pop();
        if(removed == minStack.peek()){
            minStack.pop();
        }


    }
    public int peek(){
        if(mainStack.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }

        return mainStack.peek();
    }

    public int getMin(){
        if(minStack.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }

        return minStack.peek();
    }

    public void display(){

        System.out.println("Main Stack : " + mainStack);
        System.out.println("Min Stack : " + minStack);

    }



}
