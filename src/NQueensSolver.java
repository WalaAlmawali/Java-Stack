import java.util.Stack;
// Class to represent a queen's position
class Position {
    int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public String toString(){
        return "("+row + ","+ col + ")";
    }

}

public class NQueensSolver {
   static boolean isSafe(Position pos, Stack<Position> queens ){
       for (Position q : queens) {
           // Same column
           if (q.col == pos.col) return false;

           // Same diagonal
           if (Math.abs(q.row - pos.row) == Math.abs(q.col - pos.col)) return false;
       }
       return true;
   }
    // DISPLAY BOARD
    public static void displayBoard(Stack<Position> queens, int n) {
        char[][] board = new char[n][n];

        // Fill board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Print board with coordinates
        System.out.println("\nBoard:");

        for (int i = 0; i < n; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("    ");
        for (int j = 0; j < n; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    }
        public static int solveNQueens(int n, boolean showSteps) {
            if (n <= 0) return 0;
            if (n == 1) return 1;
            if (n == 2 || n == 3) return 0;

            Stack<Position> stack = new Stack<>();
            int row = 0, col = 0;
            int solutions = 0;


        }


        public static void main(String[] args) {


        }
