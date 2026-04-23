import java.util.Stack;

public class EmployeeStackSearch {
    public static void main(String[] args){

        Stack<String> employeeStack  = new Stack<>();

        employeeStack.push("Employee John joined HR");
        employeeStack.push("Employee Sara promoted to Manager");
        employeeStack.push("Employee Ali transferred to Finance");
        employeeStack.push("Employee Maria updated profile");
        employeeStack.push("Employee Ahmed completed training");
        employeeStack.push("Employee Fatima resigned");

        System.out.println("Stack elements with positions from TOP:");
        int position = 1;

        for(int i = employeeStack.size() -1; i>= 0; i--){
            System.out.println("Position " + position + ": " + employeeStack.get(i));
            position++;

        }




    }

    }
