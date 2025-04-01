class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Teacher extends Person {
    private String subject;


    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}


class Student extends Person {
    private String grade;


    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }


    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


class Staff extends Person {
    private String department;


    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }


    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 45, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayDetails();
        teacher.displayRole();


        Student student = new Student("Ananya", 16, "10th Grade");
        System.out.println("\nStudent Details:");
        student.displayDetails();
        student.displayRole();


        Staff staff = new Staff("Mrs. Priya", 38, "Administration");
        System.out.println("\nStaff Details:");
        staff.displayDetails();
        staff.displayRole();
    }
}