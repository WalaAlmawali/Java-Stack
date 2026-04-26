import java.util.Stack;

public class HtmlTagValidator {
    public static void main(String[] args){



    }
    public static boolean validateHtmlTags(String html) {

        // Stack to store opening tags
        Stack<String> openingTagsStack = new Stack<>();

        if (html == null || html.isEmpty()) {
            System.out.println("Empty string → Valid");
            return true;
        }

        int i = 0;

        while (i < html.length()) {
            if (html.charAt(i) == '<') {
                int closeIndex = html.indexOf('>', i);

                // Invalid if no closing '>'
                if (closeIndex == -1) {
                    System.out.println("Error: Tag not closed properly.");
                    return false;
                }
                // Extract full tag
                String tag = html.substring(i + 1, closeIndex).trim();

                // Check self-closing tag
                if (tag.endsWith("/")) {
                    System.out.println("Self-closing tag: <" + tag + ">");
                }
                // Closing tag
                else if (tag.startsWith("/")) {
                    String tagName = tag.substring(1).trim();

                    if (openingTagsStack.isEmpty()) {
                        System.out.println("Error: Closing tag </" + tagName + "> found but stack is empty.");
                        return false;
                    }
                    String top = openingTagsStack.pop();
                    if (!top.equals(tagName)) {
                        System.out.println("Error: Mismatch → expected </" + top + "> but found </" + tagName + ">");
                        return false;
                    }
                    System.out.println("Matched closing tag: </" + tagName + ">");

                }
                // Opening tag
                else {

                    // Remove attributes (take only tag name)
                    String tagName = tag.split(" ")[0];
                    openingTagsStack.push(tagName);
                    System.out.println("Opening tag: <" + tagName + "> pushed to stack");
                }


            }


            }



    }


    }
