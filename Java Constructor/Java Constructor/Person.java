import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private LocalDate DOB;

    public Person(String name, int age, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.DOB = other.DOB;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("DOB : "+DOB);
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = input.nextLine();
        System.out.println("Enter the age :");
        int age = input.nextInt();
        System.out.println("Enter the date of your DOB :");
        int date = input.nextInt();
        System.out.println("Enter the month of your DOB: ");
        int month = input.nextInt();
        System.out.println("Enter the year of the DOB :");
        int year = input.nextInt();
        System.out.println();
        Person person1 = new Person(name, age, LocalDate.of(year, month, date));
        System.out.println("Person 1 Detais are :");
        person1.displayDetails();

        Person person2=new Person(person1);
        System.out.println("The cloned details from person 1 are :");
        person2.displayDetails();
    }

}
