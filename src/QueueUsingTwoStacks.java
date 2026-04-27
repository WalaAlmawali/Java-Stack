import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {



    }

    // Stack for enqueue operations
    private Stack<T> inputStack = new Stack<>();

    // Stack for dequeue operations
    private Stack<T> outputStack = new Stack<>();

    public void enqueue(T element) {
        inputStack.push(element);
        System.out.println("Enqueued: " + element);

    }
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return null;
        }
        T removed = outputStack.pop();
        System.out.println("Dequeued: " + removed);

        return removed;

    }
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return null;
        }
        T front = outputStack.peek();
        System.out.println("Front Element: " + front);
        return front;


    }
    // Get size
    public int size() {
        return inputStack.size() + outputStack.size();
    }


    }
