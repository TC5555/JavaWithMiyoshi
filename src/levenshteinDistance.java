import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class levenshteinDistance {
    public static boolean LevenshteinDist(String word1, String word2) {
      /*  if(Math.abs(word1.length() - word2.length()) > 1) {
            return false;
        }*/
        int CorrectLetters = 0;

        if(word1.length() < word2.length()){
        for(int i = 0; i < word1.length(); i++) {
            for(int j = i; j < word2.length(); j++) {
            if(word1.charAt(i) == word2.charAt(j)){
                CorrectLetters++;
                break;
            }
            }
        }
            return CorrectLetters >= word2.length() - 1;
        }


            for(int i = 0; i < word2.length(); i++) {
                for(int j = i; j < word1.length(); j++) {
                    if(word2.charAt(i) == word1.charAt(j)){
                        CorrectLetters++;
                        break;
                    }
                }
            }

        return CorrectLetters >= word2.length() - 1;
    }
    public static void LevenshteinMap(ArrayList<String> input) throws FileNotFoundException {
        Map<String, ArrayList<String>> LevMap = new HashMap<>();

        for (String str : input) {
            ArrayList<String> LevOne = new ArrayList<>();
            for (String s : input) {
                if (str.length() - s.length() > 1) {
                    continue;
                }
                if (str.length() - s.length() < -1) {
                    break;
                }
                if (LevenshteinDist(str, s)) {
                    LevOne.add(s);
                }
            }
            LevMap.put(str, LevOne);
        }
        PrintStream LevenshteinMapFile = new PrintStream(new File("LevenshteinMap.txt"));

        ArrayList<ArrayList<String>> Values = new ArrayList<>(LevMap.values());
        Object[] Keys = LevMap.keySet().toArray();
        for(int i = 0; i < LevMap.size(); i++){
            LevenshteinMapFile.println(Keys[i] + "\t" + Values.get(i));
        }
    }


    public static void main(String[] args)  throws FileNotFoundException {

        String word1 = "c";
        String word2 = "d";


        Scanner input = new Scanner(new File("dictionarySortedLength.txt"));
        ArrayList<String> Dictionary = new ArrayList<>();
        while(input.hasNext()){
            String W = input.next();
            Dictionary.add(W);
        }
        LevenshteinMap(Dictionary);
        if(!Dictionary.contains(word1) && !Dictionary.contains(word2)){
            throw new IllegalArgumentException("Not real words");
        }

        System.out.print(word1 + " " + word2 + " " + LevenshteinDist(word1,word2));
    }
}

