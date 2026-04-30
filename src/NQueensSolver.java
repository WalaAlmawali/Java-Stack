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




    }

}
        public static void main(String[] args) {


        }
