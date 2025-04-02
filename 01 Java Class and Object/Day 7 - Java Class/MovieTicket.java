import java.util.*;
public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Movie Name :"+movieName);
        System.out.println("Seat Number "+seatNumber);
        System.out.println("Price of the ticket "+price);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Set<String> availableSeats=new HashSet<>();
        List<MovieTicket> bookedTickets=new ArrayList<>();

        for (char row='A';row<='K';row++){
            for (int num=1;num<=10;num++){
                availableSeats.add(""+row+num);
            }
        }

        System.out.println("Enter the Movie name: ");
        String moviename=input.nextLine();
        System.out.println("Enter no of tickets :");
        int count=input.nextInt();
        input.nextLine();
        double totalprice=0;
        for (int i=0;i<count;i++){
            double price=200;
            System.out.println("Enter the seat number :");
            String seatnumber=input.nextLine();
            if (availableSeats.contains(seatnumber)){
                bookedTickets.add(new MovieTicket(moviename,seatnumber,price));
                availableSeats.remove(seatnumber);
                totalprice+=price;
                System.out.println("Ticket booked Succesfully");
            }
            else{
                System.out.println("Ticket booking failed");
                i--;
            }
        }
        System.out.println("Total price to be paid: "+totalprice);
        System.out.println("Enter the total amount to be paid: ");
        double pay=input.nextDouble();
        if (pay>=totalprice){
            System.out.println("Payment Successful. Your tickets are :");
            for (MovieTicket ticket:bookedTickets){
                ticket.displayDetails();
                System.out.println();
            }
        }
        else{
            System.out.println("Insufficient amount");
        }
        input.close();
    }

}
