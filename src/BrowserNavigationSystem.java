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

}
