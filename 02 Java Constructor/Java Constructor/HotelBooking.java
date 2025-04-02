import java.util.Scanner;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking hotel){
        this.guestName= hotel.guestName;
        this.roomType= hotel.roomType;
        this.nights= hotel.nights;
    }

    public HotelBooking(){
        guestName="Surya";
        roomType="Deluxe";
        nights=4;
    }

    public void displayDetails(){
        System.out.println("Guest Name : "+guestName);
        System.out.println("Room Type : "+roomType);
        System.out.println("No of Nights : "+nights);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name :");
        String guestname= input.nextLine();
        System.out.println("Enter the room type: ");
        String roomtype= input.nextLine();
        System.out.println("Enter no of nights :");
        int nights= input.nextInt();

        HotelBooking hotel1=new HotelBooking();
        hotel1.displayDetails();

        HotelBooking hotel2=new HotelBooking(guestname,roomtype,nights);
        hotel2.displayDetails();

        HotelBooking hotel3=new HotelBooking(hotel2);
        hotel3.displayDetails();
    }
}
