import java.util.Stack;
import java.util.Iterator;

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

        System.out.println(employeeStack.search("Employee Sara promoted to Manager"));
        System.out.println(employeeStack.search("Employee Maria updated profile"));

        System.out.println(employeeStack.contains("Employee Ali transferred to Finance"));

        for (int i = employeeStack.size() - 1; i >= 0; i--) {
            System.out.println(employeeStack.get(i));
        }

        for (String employee : employeeStack) {
            System.out.println(employee);
        }


        Iterator<String> iterator = employeeStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    }
