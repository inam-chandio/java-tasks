package labs.lab1;

/**
 * A class to represent an employee with a name and salary.
 */
public class Employee {
    private String name;   // Name of the employee
    private double salary; // Salary of the employee

    /**
     * Initializes the employee with a name and salary.
     *
     * @param name   The name of the employee.
     * @param salary The initial salary of the employee.
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Raises the salary of the employee by a specified percentage.
     *
     * @param percent The percentage to raise the salary by.
     */
    public void raiseSalary(double percent) {
        this.salary += this.salary * (percent / 100);
    }

    /**
     * Gets the current salary of the employee.
     *
     * @return The current salary.
     */
    public double getSalary() {
        return salary;
    }
}
