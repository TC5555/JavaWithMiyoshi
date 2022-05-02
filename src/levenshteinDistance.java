import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class levenshteinDistance {
    public static int LevenshteinDist(String word1, String word2) {
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
            return Math.abs(CorrectLetters - (word2.length()));
        }


            for(int i = 0; i < word2.length(); i++) {
                for(int j = i; j < word1.length(); j++) {
                    if(word2.charAt(i) == word1.charAt(j)){
                        CorrectLetters++;
                        break;
                    }
                }
            }

        return Math.abs(CorrectLetters - (word1.length()));
    }
    public static void LevenshteinMap(ArrayList<String> input) throws FileNotFoundException {
        Map<String, ArrayList<String>> LevMap = new HashMap<>();

        for (String str : input) {
            ArrayList<String> LevOne = new ArrayList<>();
            for (String s : input) {
                if (str.length() - s.length() > 1 || str.equals(s)) {
                    continue;
                }
                if (str.length() - s.length() < -1) {
                    break;
                }
                if (LevenshteinDist(str, s) == 1) {
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
            System.out.println(Keys[i] + "\t" + Values.get(i));
        }
    }

    public static ArrayList<String> LevenshteinPath(Map<String, ArrayList<String>> LevMap, String Input, String Target, ArrayList<String> Used) {
        return new ArrayList<>();
        /*if(!LevMap.containsKey(Input) || !LevMap.containsKey(Target)){
            throw new IllegalArgumentException("values not in map");
        }
        ArrayList<String> levP = new ArrayList<>();
        ArrayList<String> Val = new ArrayList<>(LevMap.get(Input));
        for(String Str : Val){
            if(!Used.contains(Str)){
                Used.add(Str);
            if(Str == Target){
                levP.add(Target);
                return levP;
            }
            //LevenshteinPath(LevMap, Str,Target,);
            }}*/

        /* while(true){
        ArrayList<String> Val = new ArrayList<>(LevMap.get(Input));
        int closestDist = Input.length() + 1;
        String closestStr = null;
        for(String Str : Val){
            if(Str == Target){
                levP.add(Target);
                return levP;
            }
            int dist = LevenshteinDist(Str,Input);
            if(dist < closestDist){
                closestDist = dist;
                closestStr = Str;
            }
        }
        if(levP.contains(closestStr)){
            throw new IllegalArgumentException("No Path");
        }
       levP.add(closestStr);
        }*/
    }

    public static void main(String[] args)  throws FileNotFoundException {

        String word1 = "dog";
        String word2 = "dog";


        Scanner input = new Scanner(new File("LevenshteinMap.txt"));
        Map<String, ArrayList<String>> Dictionary = new HashMap<>();
        String key = null;
        while(input.hasNext()){
            String inp = input.next();
            ArrayList<String> InpArray = new ArrayList<>();
            if(inp.charAt(0) == '['){
                InpArray.add(inp.substring(1,inp.length()-1));
                if((inp.charAt(inp.length() -1) != ']')){
                while(input.hasNext()){
                    String inp2 = input.next();
                    InpArray.add(inp2.substring(0,inp2.length()-1));
                    if(inp2.charAt(inp2.length() -1) == ']'){
                        break;
                    }
                }}
                Dictionary.put(key, InpArray);
            }
            else key = inp;
        }

       // System.out.print(LevenshteinPath(Dictionary, "dig","dot"));
/*Set<String> keys = new HashSet<>(Dictionary.keySet());
        for(int i = 0; i < keys.size(); i++){
       System.out.println(Dictionary.get(keys.toArray()[i]));}*/
/*
        Scanner input = new Scanner(new File("LevenshteinMap.txt"));
        ArrayList<String> Dictionary = new ArrayList<>();
        while(input.hasNext()){
            String W = input.next();
            Dictionary.add(W);
        }
        LevenshteinMap(Dictionary);
        if(!Dictionary.contains(word1) && !Dictionary.contains(word2)){
            throw new IllegalArgumentException("Not real words");
        }

        System.out.print(word1 + " " + word2 + " " + LevenshteinDist(word1,word2));*/
    }
}

