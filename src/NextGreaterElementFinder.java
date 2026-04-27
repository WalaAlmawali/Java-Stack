import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElementFinder {
    public static void main(String[] args) {


    }

    // Find Next Greater Element (O(n) using stack)
    public static int[] findNextGreaterElement(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>(); // store indices

        // Initialize result with -1
        Arrays.fill(result, -1);
        System.out.println("\n--- Finding Next Greater Element ---");

        for (int i = 0; i < n; i++) {
            System.out.println("\nProcessing index " + i + " value " + arr[i]);

            // While current element is greater than stack top
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = arr[i];

                System.out.println("  Pop index " + index +
                        " → Next Greater = " + arr[i]);
            }
            // Push current index
            stack.push(i);
            System.out.println("  Push index " + i + " → Stack: " + stack);

        }
        return result;

    }

    // Find Next Greater Element in Circular Array
    public static int[] findNextGreaterElementCircular(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        Arrays.fill(result, -1);
        System.out.println("\n--- Circular Next Greater Element ---");

        // Traverse twice for circular effect
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;

            while (!stack.isEmpty() && arr[index] > arr[stack.peek()]) {
                result[stack.pop()] = arr[index];
            }
            if (i < n) {
                stack.push(index);
            }


        }
return result;
    }

    // Find Next Smaller Element
    public static int[] findNextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(result, -1);
        System.out.println("\n--- Finding Next Smaller Element ---");

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return result;

    }

    // Display results in table format
    public static void displayResults(int[] arr, int[] result) {
        System.out.println("\nIndex\tValue\tNext");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i] + "\t" + result[i]);
        }

    }

    }
