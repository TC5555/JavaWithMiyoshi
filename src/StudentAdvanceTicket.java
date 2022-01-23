public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int days){
        super(number, days);
    }
    public double getPrice() {
        if (days<10){
            return 15;
        }
        return 20;
    }
    public String toString() {
        return super.toString() + " (ID required)";
    }
}