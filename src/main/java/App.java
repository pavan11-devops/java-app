import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   MOVIE TICKET BOOKING SYSTEM");
        System.out.println("==================================");

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        double totalAmount = tickets * ticketPrice;

        System.out.println("\n========= BOOKING DETAILS =========");
        System.out.println("Movie Name      : " + movieName);
        System.out.println("No. of Tickets  : " + tickets);
        System.out.println("Ticket Price    : " + ticketPrice);
        System.out.println("Total Amount    : " + totalAmount);
        System.out.println("Booking Successful!");
        System.out.println("==================================");

        sc.close();
    }
}
