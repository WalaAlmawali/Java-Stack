import java.util.Stack;
// Class to represent a queen's position
static class Position {
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

                    if (NQueensSolver.isSafe(pos, stack)) {
                        stack.push(pos);

                        if (showSteps) {
                            System.out.println("Placed: " + pos);
                            System.out.println("Stack: " + stack);
                            NQueensSolver.displayBoard(stack, n);
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

                    if (NQueensSolver.isSafe(pos, stack)) {
                        stack.push(pos);

                        if (showSteps) {
                            System.out.println("Placed: " + pos);
                            System.out.println("Stack: " + stack);
                            NQueensSolver.displayBoard(stack, n);
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

                    NQueensSolver.displayBoard(stack, n);

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
            int count = 0;

            for (int col = 0; col < n; col++) {
                Position pos = new Position(row, col);

                if (NQueensSolver.isSafe(pos, queens)) {
                    queens.push(pos);
                    count += solveRecHelper(n, row + 1, queens);
                    queens.pop(); // backtrack
                }
            }

            return count;
        }
        // ===========================
        // DISPLAY ALL SOLUTIONS
        // ===========================
        public static void displayAllSolutions(int n) {
            System.out.println("\nSolving N = " + n);

            long start1 = System.nanoTime();
            int iterativeSolutions = solveNQueens(n, false);
            long end1 = System.nanoTime();

            long start2 = System.nanoTime();
            int recursiveSolutions = solveRecursive(n);
            long end2 = System.nanoTime();

            System.out.println("Total Solutions (Iterative): " + iterativeSolutions);
            System.out.println("Total Solutions (Recursive): " + recursiveSolutions);

            System.out.println("Iterative Time: " + (end1 - start1) + " ns");
            System.out.println("Recursive Time: " + (end2 - start2) + " ns");
        }



