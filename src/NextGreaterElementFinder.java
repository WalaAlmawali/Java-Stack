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

        }




    }

    }
