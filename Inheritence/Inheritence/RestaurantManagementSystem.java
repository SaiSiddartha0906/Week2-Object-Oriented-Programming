class Per {
    private String name;
    private int id;


    public Per(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


interface Worker {

    void performDuties();
}

class Chef extends Per implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Duties: Prepares meals and specializes in " + specialty + ".");
    }
}

class Waiter extends Per implements Worker {
    private String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Duties: Serves customers in the " + section + " section.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Ramsay", 101, "French Cuisine");
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();


        Waiter waiter = new Waiter("John Doe", 102, "Dining Hall");
        System.out.println("\nWaiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}