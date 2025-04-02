import java.util.ArrayList;
import java.util.*;

class University {
    private String UniversityName;
    private List<Department1> departmentList;

    public University(String universityName) {
        this.UniversityName = universityName;
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department1 department) {
        departmentList.add(department);
    }

    public void displayDetails() {
        System.out.println("University name : " + UniversityName);
        System.out.println("Departments :");
        for (Department1 department : departmentList) {
            System.out.println(department.getDepartmentName());
        }
    }
}
class Department1{
        private String DepartmentName;
        private List<Faculty> facultyList;

    public Department1(String departmentName) {
        DepartmentName = departmentName;
        this.facultyList=new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        facultyList.add(faculty);
    }

    public String getDepartmentName(){
        return DepartmentName;
    }
    public void displayDetails(){
        System.out.println("Department Name : "+DepartmentName);
        System.out.println("Faculties : ");
        for (Faculty faculty:facultyList){
            faculty.displayDetails();
        }
    }
}

class Faculty{
    private String facultyname;

    public Faculty(String facultyname) {
        this.facultyname = facultyname;
    }

    public void displayDetails(){
        System.out.println("Faculty Name : "+facultyname);
    }
}

public class UniversityandFaculties {
    public static void main(String[] args) {
        University SRM= new University("SRM");

        Department1 Math=new Department1("Math Dept");
        Department1 Mechanical=new Department1("Mechanical Dept");

        Faculty faculty1=new Faculty("Arpit");
        Faculty faculty2=new Faculty("Aruna M");

        Math.addFaculty(faculty1);
        Math.addFaculty(faculty2);

        Mechanical.addFaculty(faculty1);

        SRM.addDepartment(Math);
        SRM.addDepartment(Mechanical);

        System.out.println("Faculty Details : ");
        Math.displayDetails();
        System.out.println();
        Mechanical.displayDetails();
        System.out.println();

        System.out.println("University Details : ");
        SRM.displayDetails();
    }
}
