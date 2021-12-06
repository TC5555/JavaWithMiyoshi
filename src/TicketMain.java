import java.util.Scanner;

public class TicketMain {
    public static void main(String[] args) {
        int days;
        Scanner console = new Scanner(System.in);
        int iChoice;
        int number = 1;

        while(true) {

            System.out.print("would you like to purchase a ticket(1) or preview prices(2)? ");
            iChoice = console.nextInt();
            if(iChoice == 1) {

                System.out.print("How many days in advance are you going to purchase the ticket(0 for walk-up)? ");
                days = console.nextInt();
                if (days == 0) {
                    WalkUpTicket MainTicket = new WalkUpTicket(number);
                    number++;
                    System.out.println(MainTicket + "\n\n");
                    continue;
                }

                System.out.print("Are you a student(1 for yes, or 2 for no)? ");
                iChoice = console.nextInt();
                if (iChoice == 1) {
                    StudentAdvanceTicket MainTicket = new StudentAdvanceTicket(number, days);
                    number++;
                    System.out.println(MainTicket + "\n");
                } else {
                    AdvanceTicket MainTicket = new AdvanceTicket(number, days);
                    number++;
                    System.out.println(MainTicket + "\n");
                }
            }
            else{
                System.out.print("How many days in advance are you planning on purchasing the ticket(0 for walk-up)? ");
                days = console.nextInt();
                if (days == 0) {
                    WalkUpTicket MainTicket = new WalkUpTicket(number);
                    number++;
                    System.out.println(MainTicket.getPrice() + "\n");
                    continue;
                }

                System.out.print("Are you a student(1 for yes, or 2 for no)? ");
                iChoice = console.nextInt();
                if (iChoice == 1) {
                    StudentAdvanceTicket MainTicket = new StudentAdvanceTicket(number, days);
                    number++;
                    System.out.println(MainTicket.getPrice() + "\n\n");
                } else {
                    AdvanceTicket MainTicket = new AdvanceTicket(number, days);
                    number++;
                    System.out.println(MainTicket.getPrice() + "\n");

            }
    }


}

    }}