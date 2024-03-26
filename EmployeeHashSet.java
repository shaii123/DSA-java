import java.util.HashSet;
import java.util.Scanner;

public class EmployeeHashSet {
    public static void main(String[] args) {
        // Creating a HashSet to store employee names
        HashSet<String> employeeSet = new HashSet<>();
        
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter employee names
        System.out.println("Enter employee names (type 'done' to finish):");

        // Reading and adding employee names from the user
        String name;
        while (!(name = scanner.nextLine()).equalsIgnoreCase("done")) {
            employeeSet.add(name);
        }

        // Closing the scanner
        scanner.close();

        // Printing out the employee names
        System.out.println("Employee names:");
        for (String employeeName : employeeSet) {
            System.out.println(employeeName);
        }
    }
}
