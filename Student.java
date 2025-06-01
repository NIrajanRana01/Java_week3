package Java_week3;

public class Student {
    private String name;
    private String idNumber;
    private final double gpa;

    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student student = new Student("Nirajan Rana", "S12345", 3.00);
        student.printStudentInfo();

        student.setName("Nirajan R.");
        student.setIdNumber("S54321");

        System.out.println("\nAfter updates:");
        student.printStudentInfo();
    }
}
