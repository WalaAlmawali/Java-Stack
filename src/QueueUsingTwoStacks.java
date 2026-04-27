import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    public static void main(String[] args) {

        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();

        queue.enqueue(10);



    }

    // Stack for enqueue operations
    private Stack<T> inputStack = new Stack<>();

    // Stack for dequeue operations
    private Stack<T> outputStack = new Stack<>();

    public void enqueue(T element) {
        inputStack.push(element);
        System.out.println("Enqueued: " + element);
        System.out.println("Input Stack: " + inputStack);
        System.out.println("Output Stack: " + outputStack);
        System.out.println("Queue Size: " + size());
        System.out.println("Logical Queue: " + getQueueOrder());

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
        System.out.println("Input Stack: " + inputStack);
        System.out.println("Output Stack: " + outputStack);
        System.out.println("Queue Size: " + size());
        System.out.println("Logical Queue: " + getQueueOrder());

        return removed;

    }
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return null;
        }
        T front = outputStack.peek();
        System.out.println("Front Element: " + front);
        System.out.println("Input Stack: " + inputStack);
        System.out.println("Output Stack: " + outputStack);
        System.out.println("Queue Size: " + size());
        System.out.println("Logical Queue: " + getQueueOrder());
        return front;


    }
    // Get size
    public int size() {
        return inputStack.size() + outputStack.size();
    }
    // Build logical queue order (for display)
    private String getQueueOrder() {
        String result = "";

        // Output stack (reverse order)
        for (int i = outputStack.size() - 1; i >= 0; i--) {
            result += outputStack.get(i) + " ";
        }

        // Input stack (normal order)
        for (int i = 0; i < inputStack.size(); i++) {
            result += inputStack.get(i) + " ";
        }

        return result.trim();
    }
    private void shiftStacksIfNeeded() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }


    }
