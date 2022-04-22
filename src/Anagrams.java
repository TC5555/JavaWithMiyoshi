
import java.io.File;
import java.io.PrintStream;
import java.util.*;
import java.io.FileNotFoundException;

public class Anagrams {

    public static String toCanon(String normal){
        char[] charArray = normal.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
}

public static Map toMap(ArrayList<String> Dictionary) throws FileNotFoundException{

        Map<String, ArrayList<String>> GramMap = new TreeMap<>();

        for(String S : Dictionary){

            String Canon = toCanon(S);

            if(GramMap.containsKey(Canon)){
                GramMap.get(Canon).add(S);
            }
            else{
                ArrayList<String> Val = new ArrayList<>();
                Val.add(S);
                GramMap.put(Canon, Val);
            }}
/*
            ArrayList<String> Matches = new ArrayList<>();

            for (String currentWord : Dictionary) {

                if (currentWord.length() < Canon.length()) {
                    continue;
                }

                if (currentWord.length() > Canon.length()) {
                    break;
                }

                if (toCanon(currentWord).equals(Canon)) {
                    Matches.add(currentWord);
                }
            }
            GramMap.put(Canon, Matches);
            }*/

    PrintStream AnagramMapFile = new PrintStream(new File("AnagramMap.txt"));

    ArrayList<ArrayList<String>> Values = new ArrayList<>(GramMap.values());
    Object[] Keys = GramMap.keySet().toArray();
    for(int i = 0; i < GramMap.size(); i++){
        AnagramMapFile.println(Keys[i] + "\t" + Values.get(i));
        System.out.println(Keys[i] + "\t" + Values.get(i));
    }
            return GramMap;
        }


    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("dictionarySortedLength.txt"));
        ArrayList<String> Dictionary = new ArrayList<>();
        while(input.hasNext()){
            String W = input.next();
            Dictionary.add(W);
        }
        toMap(Dictionary);
}
}
