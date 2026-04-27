import java.util.Stack;
public class StackSorter {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3);
        s1.push(1);
        s1.push(4);
        s1.push(2);

        System.out.println(sortStack(s1));


    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > current) {

                stack.push(tempStack.pop());
            }
            tempStack.push(current);

        }

        return tempStack;
    }
    public static void sortStackRecursive(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        sortStackRecursive(stack);


    }
}



