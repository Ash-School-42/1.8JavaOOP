/**
 * Name: James Ash
 * Date: 03-04-2026
 * Assignment: 1.8 Performance Assessment - Classes
 * Description: This class represents an Employee with properties like first name, last name, and monthly salary.
 * The class includes constructors, setters, getters, and a salary validation method.
 */

public class Employee {
    // Private instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Public constructor to initialize the variables
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Only set the Monthly Salary if it is >= 1000
        if (monthlySalary >= 1000) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 1000; // Set to a default valid value if invalid salary is provided
        }
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        // Only set the Monthly Salary if it is >= 1000
        if (monthlySalary >= 1000) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}
