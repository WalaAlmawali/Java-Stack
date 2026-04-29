import java.util.Stack;
public class LargestRectangleInHistogram {
    public static void main(String[] args) {


    }
    public static int findLargestRectangle(int[] heights){

        if (heights.length == 0){
            return 0;
        }
         Stack<Integer> indicesOfHistogram = new Stack<>();

        int maxArea = 0;
        int i = 0;
        while(i< heights.length){

            if(heights[i]>= heights[indicesOfHistogram.peek()] || indicesOfHistogram.isEmpty()){
                indicesOfHistogram.push(i);
                i++;

            }else{
                int top = indicesOfHistogram.pop();
            }

        }

    }

    public static int calculateArea(int heights, int width){
        return heights * width ;

    }



    }
