import java.util.Scanner;

public class printReverse {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            console.delimiter()
            System.out.print("enter string: ");
            String ToReverse = console.next(), Reversed = "";

            for (int i = ToReverse.length() - 1; i >= 0; i--) {
                char c = ToReverse.charAt(i);
                Reversed += c;
            }
            System.out.print("\"" + Reversed + "\"");
        }

}
