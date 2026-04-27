import java.util.Stack;

public class BrowserNavigationSystem {
    public static void main(String[] args){



    }
    // Stack to store back history
    private Stack<String> backStack = new Stack<>();

    // Stack to store forward history
    private Stack<String> forwardStack = new Stack<>();

    // Variable to store current page
    private String currentPage = null;

    // Maximum limit for back history
    private final int MAX_HISTORY = 10;


    public void visitPage(String url) {

        if (currentPage != null) {
            // Push current page to back stack
            backStack.push(currentPage);

            // Maintain maximum history size
            if (backStack.size() > MAX_HISTORY) {
                backStack.remove(0); // Remove oldest page
            }

    }


}
