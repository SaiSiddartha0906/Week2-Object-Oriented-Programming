public class Employee {

    static String companyName="CG";
    String name;
    final String id;
    String designation;
    static int count=0;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        count++;
    }
    public static void displayTotalEmployess(){
        System.out.println("Total Employees: "+count);
    }
    public void DisplayDetails(){
        if(this instanceof Employee){
            System.out.println("Company name: "+companyName);
            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
            System.out.println("Designation: "+designation);

        }else{
            System.out.println("Invalid");
        }

    }

    public static void main(String[] args) {
        Employee e1=new Employee("Jhon","414","SE");
        Employee e2=new Employee("Alice","415","Cloud");
        e1.DisplayDetails();
        Employee.displayTotalEmployess();
    }



}
