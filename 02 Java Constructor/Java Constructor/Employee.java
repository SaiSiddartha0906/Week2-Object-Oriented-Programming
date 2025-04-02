import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String managerTitle;

    public Manager(int employeeID, String department, double salary, String managerTitle) {
        super(employeeID, department, salary);
        this.managerTitle = managerTitle;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Title: " + managerTitle);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1001, "HR", 50000));
        employees.add(new Manager(1002, "Finance", 75000, "Senior Manager"));

        while (true) {
            System.out.println("Enter 1 to View Employee Details\n2. Update Salary\n3. View Manager Details\n4. Exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 4) {
                break;
            }

            System.out.println("Enter Employee ID:");
            int employeeID = input.nextInt();
            input.nextLine();
            Employee employee = null;

            for (Employee emp : employees) {
                if (emp.employeeID == employeeID) {
                    employee = emp;
                    break;
                }
            }

            if (employee == null) {
                System.out.println("Employee not found!");
                continue;
            }

            switch (choice) {
                case 1:
                    employee.displayDetails();
                    break;
                case 2:
                    System.out.println("Enter new salary:");
                    double newSalary = input.nextDouble();
                    employee.updateSalary(newSalary);
                    break;
                case 3:
                    if (employee instanceof Manager) {
                        ((Manager) employee).displayManagerDetails();
                    } else {
                        System.out.println("This employee is not a manager!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}