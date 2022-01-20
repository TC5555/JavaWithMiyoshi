import java.io.*;
import java.util.*;

public class FileLineArrayMain {

    public static ArrayList<String> getReversed(ArrayList<String> line) {
        ArrayList<String> Reversed = new ArrayList<>();
        for(int i = line.size() - 1; i >= 0; i--) {
            Reversed.add(line.get(i));
        }
        return Reversed;
    }


    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("oldlady.txt"));

        ArrayList<ArrayList<String>> LineReverse = new ArrayList<>();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            ArrayList<String> ArrayLine = new ArrayList<>(Arrays.asList(line.split(" ")));

            LineReverse.add(ArrayLine);
        }
        for(int i = LineReverse.size() - 1; i >= 0; i--){
            ArrayList<String> AS = new ArrayList<>(LineReverse.get(i));
            for(String s : AS) {
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }

        Scanner inputRev = new Scanner(new File("oldlady.txt"));
        while (inputRev.hasNextLine()) {
            String line = inputRev.nextLine();
            ArrayList<String> ArrayLine = new ArrayList<>(Arrays.asList(line.split(" ")));

            for(String s: getReversed(ArrayLine)){
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }


    }
}