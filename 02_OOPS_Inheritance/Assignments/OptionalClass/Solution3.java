/*Given an Employee object which may be initialized to null, use optional class to check if it is null and to throw an user defined exception InvalidEmployeeException.*/

import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}


public class Solution3 {
    public static void main(String[] args) {
        Employee emp = null; // may be null

        try {
            // Use Optional to handle null safely
            Optional<Employee> optEmp = Optional.ofNullable(emp);

            // Throw custom exception if empty
            Employee e = optEmp.orElseThrow(() ->
                new InvalidEmployeeException("Invalid Employee Object")
            );

            // If not null, print employee details
            System.out.println("Employee Name: " + e.name);

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
