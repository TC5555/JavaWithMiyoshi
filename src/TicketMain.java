import java.util.*;

public class TicketMain {
    public static void main(String[] args) {
        int days;
        Scanner console = new Scanner(System.in);
        ArrayList<TicketClass> Ticket = new ArrayList<TicketClass>();
        int iChoice;
        int TIndex = 0;

        while (true) {
            System.out.print("How many days in advance are you going to purchase the ticket(0 for walk-up)? ");
            days = console.nextInt();
            if (days == 0) {
                Ticket.add(new WalkUpTicket(TIndex + 1));
            } else {
                System.out.print("Are you a student(1 for yes, or 2 for no)? ");
                iChoice = console.nextInt();
                if (iChoice == 1) {
                    Ticket.add(new StudentAdvanceTicket(TIndex + 1, days));
                } else {
                    Ticket.add(new AdvanceTicket(TIndex + 1, days));
                }
            }
            System.out.print("Price: $" + Ticket.get(TIndex).getPrice() + "\nWould you like to purchase ticket(1 for Yes)? ");
            iChoice = console.nextInt();
            if (iChoice == 1) {
                System.out.println(Ticket.get(TIndex).toString());
            }
        }
    }
}
