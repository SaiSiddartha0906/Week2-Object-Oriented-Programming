import java.util.*;
class Course{
    private String CourseName;
    private List<Student> studentList;

    public Course(String courseName) {
        this.CourseName = courseName;
        this.studentList=new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void displayDetails(){
        System.out.println(" Students enrolled in Course "+CourseName);
        for (Student student:studentList){
            System.out.println("Student name :"+student.getStudentName());
        }
    }
}
class Student{
    private String StudentName;
    private String Gender;
    private List<Course> courseList;

    public Student(String studentName, String gender) {
        this.StudentName = studentName;
        this.Gender = gender;
        this.courseList=new ArrayList<>();
    }

    public void addCourses(Course course){
        courseList.add(course);
        course.addStudent(this);
    }

    public void displayDetails(){
        for(Course course:courseList){
            course.displayDetails();
        }
    }

    public String getStudentName(){
        return StudentName;
    }
}
class School{
    private String SchoolName;
    private List<Student> studentList;

    public School(String SchoolName){
        this.SchoolName=SchoolName;
        this.studentList=new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void displayDetails(){
        System.out.println("School name : "+SchoolName);
        System.out.println("Students :");
        for (Student student:studentList){
            System.out.println("Student name :"+student.getStudentName());
        }
    }

}
public class School_Student_Courses {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        School school = new School("Springfield High");

        // Create some courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Create some students
        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Bob", "Male");
        Student student3 = new Student("Charlie", "Male");

        student1.addCourses(math);
        student1.addCourses(science);
        student2.addCourses(science);
        student2.addCourses(history);
        student3.addCourses(math);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        school.displayDetails();
        System.out.println();

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        student3.displayDetails();
        System.out.println();

        math.displayDetails();
        System.out.println();
        science.displayDetails();
        System.out.println();
        history.displayDetails();

    }

}
