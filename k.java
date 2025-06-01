package Java_week3;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double amount) {
        double newSalary = salary + amount;
        if (newSalary >= 0) {
            salary = newSalary;
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Jhaps", "E123", 5);
        emp.printDetails();

        emp.updateSalary(5000);  
        System.out.println("\nAfter salary increase:");
        emp.printDetails();

        emp.updateSalary(-60000);  
        System.out.println("\nAfter attempting large decrease:");
        emp.printDetails();
    }
}

