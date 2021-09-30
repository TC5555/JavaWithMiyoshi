import java.util.Scanner;

public class processName {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.print("enter string: ");
            String ToReverse = console.nextLine(), Reversed = "";

            for (int i = ToReverse.length() - 1; i >= 0; i--) {
                char c = ToReverse.charAt(i);
                Reversed += c;
            }
            System.out.print("\"" + Reversed + "\"");
        }

    }

}
