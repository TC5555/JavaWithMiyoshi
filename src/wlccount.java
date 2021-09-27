import java.io.*;;
import java.util.*;

public class wlccount {
    public static void main(String[] args)
            throws FileNotFoundException {
                Scanner input = new Scanner(new File("oldlady.txt"));
            int wcount = 0, ccount = 0, lcount = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lcount++;
                for(int i = 0; i < line.length(); i++){
                String word = line;
                wcount++;
            for(int i = 0; i < word.length(); i++) {
                ccount++;
            }}
            }

            System.out.println("total words = " + wcount + " total chars = " + ccount + " total lines = " + lcount );
    }
}
