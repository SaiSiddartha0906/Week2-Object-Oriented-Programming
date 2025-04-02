import java.util.ArrayList;
import java.util.List;


abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;


    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

interface Department {
    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary for full-time employees
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // Base salary not used for part-time employees
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Salary based on hours worked
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeManagmentSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();


        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 50000);
        fullTimeEmployee.assignDepartment("IT");
        employees.add(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Bob", 300, 40);
        partTimeEmployee.assignDepartment("Finance");
        employees.add(partTimeEmployee);


        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}