import java.util.Stack;
public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(findLargestRectangle(arr));

    }

    public static int findLargestRectangle(int[] heights) {

        if (heights.length == 0) {
            return 0;
        }
        Stack<Integer> indicesOfHistogram = new Stack<>();

        int maxArea = 0;
        int i = 0;
        while (i < heights.length) {

            if (indicesOfHistogram.isEmpty()) {
                indicesOfHistogram.push(i);
                i++;
            }

            if (heights[i] >= heights[indicesOfHistogram.peek()]) {
                indicesOfHistogram.push(i);
                i++;

            } else {
                int top = indicesOfHistogram.pop();
                int height = heights[top];
                int width;

                if (indicesOfHistogram.isEmpty()) {
                    width = i;
                } else {
                    width = i - indicesOfHistogram.peek() - 1;
                }

                int area = calculateArea(height, width);

                maxArea = Math.max(maxArea, area);

            }
        }

        while (!indicesOfHistogram.isEmpty()) {

            int top = indicesOfHistogram.pop();
            int height = heights[top];
            int width;
            if (indicesOfHistogram.isEmpty()) {
                width = i;
            } else {
                width = i - indicesOfHistogram.peek() - 1;
            }
            int area = calculateArea(height, width);

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static int calculateArea(int heights, int width) {
        return heights * width;

    }

    public static void displayHistogram(int[] heights) {
        System.out.println("Histogram");
        int max = 0;
        for (int h : heights) max = Math.max(max, h);

        for (int i = max; i > 0; i--) {

            for (int h : heights) {
                if (h >= i) System.out.print("*");
                else System.out.print("");
            }
            System.out.println();

        }

        for (int h : heights) System.out.print("---");
        System.out.println();

        for (int h : heights) System.out.print("" + h + "");
        System.out.println("\n");

    }
}
