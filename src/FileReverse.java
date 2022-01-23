import java.io.*;
import java.util.*;

public class FileReverse {

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

        PrintStream oldladyreverselines = new PrintStream(new File("oldladyreverselines.txt"));

        for(int i = LineReverse.size() - 1; i >= 0; i--){
            ArrayList<String> AS = new ArrayList<>(LineReverse.get(i));
            for(String s : AS) {
                oldladyreverselines.print(s + " ");
                System.out.print(s + " ");
            }
            oldladyreverselines.print("\n");
            System.out.print("\n");
        }

        Scanner inputRev = new Scanner(new File("oldlady.txt"));
        PrintStream oldladyreversewords = new PrintStream(new File("oldladyreversewords.txt"));

        while (inputRev.hasNextLine()) {
            String line = inputRev.nextLine();
            ArrayList<String> ArrayLine = new ArrayList<>(Arrays.asList(line.split(" ")));

            for(String s: getReversed(ArrayLine)){
                oldladyreversewords.print(s + " ");
                System.out.print(s + " ");
            }
            oldladyreversewords.print("\n");
            System.out.print("\n");
        }


    }
}