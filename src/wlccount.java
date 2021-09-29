import java.io.*;
import java.util.*;
/* This program doesn't handle excess lines or spaces properly. don't know if that was a requirement.*/
public class wlccount {
    public static void main(String[] args)
            throws FileNotFoundException {
                Scanner input = new Scanner(new File("oldlady.txt"));
            int wcount = 0, ccount = 0, lcount = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                lcount++;
                wcount++;
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    ccount++;
                    if (c == ' ') {
                        wcount++;
                        ccount--;
                    }
                }
            }
        System.out.println("total words = " + wcount + " total chars = " + ccount + " total lines = " + lcount );
    }}
