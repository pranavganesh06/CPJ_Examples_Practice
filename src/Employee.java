public class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    // Returns the employee's name
    public String getName() {
        return name;
    }

    // Returns the employee's salary
    public double getSalary() {
        return salary;
    }

    // Raises the salary by a given percentage
    public void raiseSalary(double byPercent) {
        salary = salary + (salary * byPercent / 100);
    }
}
