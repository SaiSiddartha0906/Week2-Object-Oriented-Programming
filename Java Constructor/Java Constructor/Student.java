import java.util.Scanner;

public class Student {
    public String rollNumber;
    protected String name;
    private double CGPA;

    public Student(String rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(String rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public String getName() {
        return "Postgraduate Student Name: " + name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the roll number:");
        String rollNumber = input.nextLine();

        System.out.println("Enter the name:");
        String name = input.nextLine();

        System.out.println("Enter the CGPA:");
        double cgpa = input.nextDouble();

        Student student = new Student(rollNumber, name, cgpa);

        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.getName());
        System.out.println("CGPA: " + student.getCGPA());

        System.out.println("\nEnter the new CGPA:");
        double newCGPA = input.nextDouble();
        student.setCGPA(newCGPA);

        System.out.println("\nUpdated Student Details:");
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.getName());
        System.out.println("CGPA: " + student.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, newCGPA);

        System.out.println("\nPostgraduate Student Details:");
        System.out.println("Roll Number: " + pgStudent.rollNumber);
        System.out.println(pgStudent.getName());
        System.out.println("CGPA: " + pgStudent.getCGPA());
    }
}