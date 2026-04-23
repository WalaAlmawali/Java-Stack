import java.util.Stack;

public class EmployeeStackDemo {
   public static void main(String[] args){
      Stack<String> stack = new Stack<>();

      stack.push("Employee John added to HR department");
      stack.push("Employee Sara promoted to Team Leader");
      stack.push("Employee Ali transferred to Finance department");
      stack.push("Employee Maria updated personal details");
      stack.push("Employee Ahmed completed training program");

      System.out.println(stack);

      stack.push("Employee Mohammed completed training program");

      System.out.println("Updated stack:" + stack);


   }
}
