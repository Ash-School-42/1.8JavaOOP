/**
 * Name: James Ash
 * Date: 03-04-2026
 * Assignment: 1.8 Performance Assessment - Classes
 * Description: This is the main application class that creates and updates Employee objects.
 * It also demonstrates the use of constructors, getters, setters, and instance variables.
 */

public class App {
    public static void main(String[] args) {
        // Print header information
        System.out.println("James Ash - Week 1 PA Classes");
        
        // Create 2 Employee objects
        Employee employee1 = new Employee("John", "Doe", 1200);  // Valid salary
        Employee employee2 = new Employee("Jane", "Smith", 800); // Invalid salary (set to 1000 in constructor)
        
        // Print initial employee information
        System.out.println("\n--- Initial Employee Information ---");
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
        
        // Update employee information
        employee1.setLastName("Johnson");  // Update last name of employee1
        employee2.setFirstName("Alice");   // Update first name of employee2
        employee1.setMonthlySalary(1500);  // Update salary of employee1
        employee2.setMonthlySalary(1300);  // Update salary of employee2
        
        // Print updated employee information
        System.out.println("\n--- Updated Employee Information ---");
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
    }
}
