import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryDicSearch {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(new File("dictionarySorted.txt"));
        LinkedList<String> Dictionary = new LinkedList<>();
        while(input.hasNext()){
            String W = input.next();
            Dictionary.add(W);
        }
        String word1 = "goodbye";
        String word2 = "goodbys";
        int word1place = Collections.binarySearch(Dictionary, word1);
        int word2place = Collections.binarySearch(Dictionary, word2);
        if(word1place == word2place) {
            throw new IllegalArgumentException("equal input");
        }
        if(word1place < 1) {
            throw new IllegalArgumentException("not real word: " + word1);
        }
        if(word2place < 1) {
            throw new IllegalArgumentException("not real word: " + word2);
        }
        int diff = Math.abs(word1place - word2place) -1;
        System.out.print(diff);

    }
}
