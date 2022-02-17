public class AdvanceTicket extends TicketClass {
    protected int days;
    public AdvanceTicket(int number, int days){
        super(number);
        this.days = days;
    }
    public double getPrice() {
        if (days<10){
            return 30;
        }
        return 40;
    }
}
