import java.util.*;

class Student1{
    private String StudentName;
    private List<Course1> courseList;

    public Student1(String studentName) {
        StudentName = studentName;
        this.courseList=new ArrayList<>();
    }

    public void EnrollCourse(Course1 course){
        courseList.add(course);
        course.addStudent(this);
    }

    public void displayDetails(){
        System.out.println("Student Name : "+StudentName);
        System.out.println("Enrolled Courses :");
        for (Course1 course:courseList){
            System.out.println("Course : "+course.getCourseName());
        }
    }
}

class Course1 {
    private String CourseName;
    private List<Student1> studentList;
    private List<Professor> professorList;

    public Course1(String courseName) {
        CourseName = courseName;
        this.studentList = new ArrayList<>();
        this.professorList = new ArrayList<>();
    }

    public void addStudent(Student1 student) {
        studentList.add(student);
    }

    public void assignProfessor(Professor professor) {
        professorList.add(professor);
        professor.addCourse(this);
    }

    public String getCourseName() {
            return CourseName;
        }
    }

class Professor{
    private String ProfessorName;
    private List<Course1> courseList;

    public Professor(String professorName) {
        ProfessorName = professorName;
        this.courseList=new ArrayList<>();
    }

    public void addCourse(Course1 course){
        courseList.add(course);
    }
    public void displayDetails(){
        System.out.println("Professor Name : "+ProfessorName);
        for (Course1 course:courseList){
            System.out.println("Course : "+course.getCourseName());
        }
        }
    }

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student1 student1=new Student1("Surya");
        Student1 student2=new Student1("Vardhan");

        Professor professor1=new Professor("Arpit");
        Professor professor2=new Professor("Aruna M");

        Course1 course1=new Course1("English");
        Course1 course2=new Course1("Java");

        course1.assignProfessor(professor1);

        course2.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        student1.EnrollCourse(course1);
        student1.EnrollCourse(course2);

        student2.EnrollCourse(course2);


        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();

        professor1.displayDetails();
        System.out.println();
        professor2.displayDetails();
        System.out.println();


    }
}
