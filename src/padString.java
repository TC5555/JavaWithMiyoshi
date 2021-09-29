import java.util.*;

public class padString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("enter string: ");
        String ToPad = console.next();
        System.out.print("enter string length: ");
        int PadAmount = console.nextInt();

        PadAmount -= ToPad.length();

        for(int i = 0; i < PadAmount; i++){
            if(PadAmount == ToPad.length()) {
            break;
            }

            ToPad += " ";
        }
        System.out.print("\"" + ToPad + "\"");
    }
}
