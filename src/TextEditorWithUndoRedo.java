import java.util.Stack;

public class TextEditorWithUndoRedo {
    public static void main(String[] args){



    }

    // Stack for undo operations
    private Stack<String> undoStack = new Stack<>();

    // Stack for redo operations
    private Stack<String> redoStack = new Stack<>();

    // Store current text as a simple String
    private String currentText = "";

    private static final int MAX_HISTORY = 10;


    // Method to type/add text
    public void type(String text) {

        // Save current state before change
        saveToUndoStack();

        // Concatenate new text
        currentText = currentText + text;

        // Clear redo stack after new action
        redoStack.clear();
        System.out.println("Current Text: \"" + currentText + "\"");
        System.out.println("Undo Stack: " + undoStack);
        System.out.println("Redo Stack: " + redoStack);


    }

    // Method to undo last action
    public void undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        // Save current state to redo stack
        redoStack.push(currentText);

        // Restore previous state
        currentText = undoStack.pop();



    }

    // Save state to undo stack with size limit
    private void saveToUndoStack() {
        if (undoStack.size() == MAX_HISTORY) {
            // Remove oldest element
            undoStack.remove(0);
        }
        undoStack.push(currentText);
    }



}
