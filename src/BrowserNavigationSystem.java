import java.util.Stack;
import java.util.ArrayList;


public class BrowserNavigationSystem {
    public static void main(String[] args) {


    }

    // Stack to store back history
    private Stack<String> backStack = new Stack<>();

    // Stack to store forward history
    private Stack<String> forwardStack = new Stack<>();

    // Variable to store current page
    private String currentPage = null;

    // Maximum limit for back history
    private final int MAX_HISTORY = 10;

    // List to store all visited pages in the session
    private ArrayList<String> sessionHistory = new ArrayList<>();


    public void visitPage(String url) {

        if (currentPage != null) {
            // Push current page to back stack
            backStack.push(currentPage);

            // Maintain maximum history size
            if (backStack.size() > MAX_HISTORY) {
                backStack.remove(0); // Remove oldest page
            }

        }
        // Set new current page
        currentPage = url;

        // Clear forward stack (new navigation resets forward history)
        forwardStack.clear();

        System.out.println("Visited: " + url);
        System.out.println("Current Page: " + currentPage);
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);


    }
    public void goBack() {

        if (backStack.isEmpty()) {
            System.out.println("Cannot go back, no history.");
            return;
        }

        // Push current page to forward stack
        forwardStack.push(currentPage);

        // Pop from back stack to current page
        currentPage = backStack.pop();

        System.out.println("Went Back");
        System.out.println("Current Page: " + currentPage);
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);


    }

    // Navigate forward
    public void goForward() {

        if (forwardStack.isEmpty()) {
            System.out.println("Cannot go forward, no forward history.");
            return;
        }
        // Push current page to back stack
        backStack.push(currentPage);

        currentPage = forwardStack.pop();

        System.out.println("Went Forward");
        System.out.println("Went Back");
        System.out.println("Current Page: " + currentPage);
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);

    }

    // Show current page
    public void showCurrentPage() {
        System.out.println("Current Page: " + currentPage);
    }

    public void showHistory() {
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);
    }

    // Show full session history
    public void showSessionHistory() {
        System.out.println("Session History: " + sessionHistory);
    }

}
