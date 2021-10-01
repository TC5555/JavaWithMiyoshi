import java.util.Scanner;

public class processName {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            System.out.print("enter string: ");
            String ToYoda = console.nextLine();

            String[] Yodarray = ToYoda.split(" ");
            System.out.print(Yodarray[Yodarray.length - 1] + ", ");

            for (int i = 0; i < Yodarray.length - 1; i++) {
                System.out.print(Yodarray[i] + " ");
            }
        }
}

