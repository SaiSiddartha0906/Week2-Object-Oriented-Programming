public class Student {

    static String universityName;
    String name;
    String rollNumber;
    char grade;
    static int count=0;

    public Student(String name, String rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        count++;
    }
    static void displayTotalStudents(){
        System.out.println("Total number of students are: "+count);

    }
    public void Display(){
        if(this instanceof Student){
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }else{
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Student s1=new Student("Jhon","RA414",'A');
        s1.Display();
        Student.displayTotalStudents();
    }



}
