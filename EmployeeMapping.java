import java.util.*;
import java.util.function.*;

public class EmployeeMapping {

    static class Employee {
        String firstName;
        String lastName;
        double salary;

        public Employee(String firstName, String lastName, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Smith", 5000));
        employees.add(new Employee("Emma", "Brown", 6000));
        employees.add(new Employee("Ali", "Karimov", 4500));

        Function<Employee, String> formatCard =
                e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() +
                     "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        System.out.println("Employee Cards:");
        for (Employee e : employees) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary only: $" + salaryPicker.apply(e));
        }
    }
} 
