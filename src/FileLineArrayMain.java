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

    public static ArrayList<String> getRando(ArrayList<String> line) {
        ArrayList<String> Randomized = new ArrayList<>();

        Random Ran = new Random();
        ArrayList<String> line2 = new ArrayList<>(line);
        for(int i = 0; i < line.size(); i++) {
            int ThisRan = Ran.nextInt(line2.size());
            Randomized.add(line2.get(ThisRan));
            line2.remove(ThisRan);
        }
        return Randomized;
    }

    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("oldlady.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            ArrayList<String> ArrayLine = new ArrayList<>(Arrays.asList(line.split(" ")));

            for(String s: ArrayLine){
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

        Scanner inputRan = new Scanner(new File("oldlady.txt"));
        while (inputRan.hasNextLine()) {
            String line = inputRan.nextLine();
            ArrayList<String> ArrayLine = new ArrayList<>(Arrays.asList(line.split(" ")));

            for(String s: getRando(ArrayLine)){
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
    }
}