public class AdvanceTicket extends TicketClass {
    protected double price;
    public AdvanceTicket(int number, int days){
        super(number);
        if (days<10){
            price = 30;
        }
        else price = 40;
    }
    public double getPrice() {
        return price;
    }
}
