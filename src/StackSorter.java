import java.util.Stack;
public class StackSorter {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3);
        s1.push(1);
        s1.push(4);
        s1.push(2);

        System.out.println("Befor sorting : ");
        displayStack(s1,"Stak1");
        System.out.println("After sorting : ");
        Stack <Integer>sorted1 =sortStack(s1);
        displayStack(sorted1,"sorted Stack");

        Stack<Integer> s2 = new Stack<>();
        s2.push(3);
        s2.push(1);
        s2.push(4);
        s2.push(2);
        System.out.println("Befor sorting : ");
        displayStack(s2,"Stak2");
        sortStackRecursive(s2);
        displayStack(s2, "Sorted Stack (Recursive)");



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
        insertInSortedOrder(stack,top);

    }
    //Helper function
    public static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;

        }
        int temp = stack.pop();
        insertInSortedOrder(stack, value);

        stack.push(temp);

    }
    public static void displayStack(Stack<Integer> stack, String name){

        System.out.println(name + " : "+ stack);
    }
}



