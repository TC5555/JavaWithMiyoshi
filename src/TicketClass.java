public class TicketClass {
    int number;
    public TicketClass(int number){
       this.number = number;
    }

    public String toString() { return "Number: " + number + " Price: $" + getPrice(); }

    public double getPrice() {
            return 0;
    }
}
