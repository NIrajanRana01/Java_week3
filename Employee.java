package Java_week3;
public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentageIncrease) {
        if (percentageIncrease >= 0) {
            salary += salary * (percentageIncrease / 100);
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Anil", "Software Engineer", 60000);
        emp.printDetails();

        emp.updateSalary(10);

        System.out.println("\nAfter 10% Salary Increase:");
        emp.printDetails();
    }
}
