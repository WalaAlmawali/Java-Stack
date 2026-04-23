import java.util.Stack;

public class BrowserHistorySimulator {
    public static void main(String[] args){

        Stack<String> BrowserHistory = new Stack<>();

        BrowserHistory.push("google.com");
        System.out.println(BrowserHistory);

        BrowserHistory.push("youtube.com");
        System.out.println(BrowserHistory);

        BrowserHistory.push("github.com");
        System.out.println(BrowserHistory);

        BrowserHistory.push("stackoverflow.com");
        System.out.println(BrowserHistory);

        BrowserHistory.push("wikipedia.org");
        System.out.println(BrowserHistory);

    }


    }
