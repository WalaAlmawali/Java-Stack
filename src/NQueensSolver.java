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

            while (true) {
                boolean placed = false;

                while (col < n) {
                    Position pos = new Position(row, col);

                    if (isSafe(pos, stack)) {
                        stack.push(pos);

                        if (showSteps) {
                            System.out.println("Placed: " + pos);
                            System.out.println("Stack: " + stack);
                            displayBoard(stack, n);
                        }

                        row++;
                        col = 0;
                        placed = true;
                        break;
                    } else {
                        col++;
                    }
                }

        }
            while (true) {
                boolean placed = false;

                while (col < n) {
                    Position pos = new Position(row, col);

                    if (isSafe(pos, stack)) {
                        stack.push(pos);

                        if (showSteps) {
                            System.out.println("Placed: " + pos);
                            System.out.println("Stack: " + stack);
                            displayBoard(stack, n);
                        }

                        row++;
                        col = 0;
                        placed = true;
                        break;
                    } else {
                        col++;
                    }
                }

                // If placed all queens
                if (row == n) {
                    solutions++;
                    System.out.println("✅ Solution #" + solutions + ": " + stack);

                    displayBoard(stack, n);

                    // Backtrack
                    Position last = stack.pop();
                    row--;
                    col = last.col + 1;
                }

                // If no position found → backtrack
                if (!placed) {
                    if (stack.isEmpty()) break;

                    Position last = stack.pop();

                    if (showSteps) {
                        System.out.println("Backtracking from: " + last);
                    }

                    row--;
                    col = last.col + 1;
                }
            }

            return solutions;
        }

        }
        public static int solveRecursive(int n) {
            return solveRecHelper(n, 0, new Stack<>());
        }
        private static int solveRecHelper(int n, int row, Stack<Position> queens) {
            if (row == n) {
                return 1;
            }



