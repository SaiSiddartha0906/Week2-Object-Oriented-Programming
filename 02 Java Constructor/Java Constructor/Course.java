import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName="SRM Institute of Science and Technology";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration : "+duration);
        System.out.println("Fee : "+fee);
        System.out.println("Institute Name: "+Course.instituteName);
    }
    public static void updateInstituteName(String newinstitutename){
        Course.instituteName=newinstitutename;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1. Display Details\n 2. Change Institute Name\n 3. To exit");
            int choice=input.nextInt();
            input.nextLine();
            if (choice==3){
                break;
            }
            else if (choice==2){
                System.out.println("Enter the new institute name: ");
                String newinstitutename= input.nextLine();
                Course.updateInstituteName(newinstitutename);
            }
            else{
                System.out.println("Enter the coursename : ");
                String coursename= input.nextLine();
                System.out.println("Enter the duration : ");
                int duration= input.nextInt();
                System.out.println("Enter the fee : ");
                double fee=input.nextDouble();

                Course course1=new Course(coursename,duration,fee);
                course1.displayCourseDetails();
            }
        }
    }
}
