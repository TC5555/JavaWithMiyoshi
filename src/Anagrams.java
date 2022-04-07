
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
public class Anagrams {
    public static String toCanon(String normal){
        char[] charArray = normal.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
}
public static Map toMap(ArrayList<String> Dictionary){
        Map<String, ArrayList<String>> GramMap = new HashMap<>();
        for(String S : Dictionary){
            for(int i)

        }
}

    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("dictionarySortedLength.txt"));
        ArrayList<String> Dictionary = new ArrayList<>();
        while(input.hasNext()){
            String W = input.next();
            Dictionary.add(W);
        }

}
}
