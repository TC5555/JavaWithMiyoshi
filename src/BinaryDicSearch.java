import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryDicSearch {
    public static int binarySearch(LinkedList list, String keyword) {
        int min = 0, max = list.size();
        for (int i = 1; i < Math.log(list.size()); i++) {
            if (list.subList(min, max).get(list.subList(min, max).size() / 2).toString().charAt(0) < keyword.charAt(0)) {
                min += list.subList(min, max).size() / 2;
            }
            else if(keyword.charAt(0) == list.subList(min, max).get(list.subList(min, max).size() / 2).toString().charAt(0)){
              //  int ans  =list.subList(min, max).get(list.subList(min, max).size() / 2);
            }
        }
       return 0;
    }
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(new File("dictionarySorted.txt"));
        LinkedList<String> Dictionary = new LinkedList<>();
        while(input.hasNext()){
            String W = input.next();
            Dictionary.add(W);
        }
        String word1 = "goodbye";
        String word2 = "goodbys";
        int word1place = binarySearch(Dictionary, word1);
        int word2place = binarySearch(Dictionary, word2);
      /*  if(word1place == word2place) {
            throw new IllegalArgumentException("equal input");
        }
        if(word1place < 1) {
            throw new IllegalArgumentException("not real word: " + word1);
        }
        if(word2place < 1) {
            throw new IllegalArgumentException("not real word: " + word2);
        }*/
        int diff = Math.abs(word1place - word2place) -1;
        System.out.print(diff);

    }
}
