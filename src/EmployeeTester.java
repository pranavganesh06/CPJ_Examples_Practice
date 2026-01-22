public class EmployeeTester {
    public static void main(String[] args) {
        // Create an Employee object
        Employee harry = new Employee("Hacker, Harry", 50000);

        // Test getName
        System.out.println("Name: " + harry.getName());

        // Test getSalary
        System.out.println("Initial Salary: " + harry.getSalary());

        // Test raiseSalary
        harry.raiseSalary(10);

        // Check updated salary
        System.out.println("Salary after 10% raise: " + harry.getSalary());
    }
}
