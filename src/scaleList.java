import java.util.*;

public class scaleList {
    public static ArrayList<Integer> ScaleByK(ArrayList<Integer> ToScale) {
        ArrayList<Integer> Scaled = new ArrayList<>();
        for(int i = 0; i < ToScale.size(); i++) {
            int k=ToScale.get(i);
            System.out.println(k);
            for(int j = 0; j < k; j++) {
                Scaled.add(k);
            }
        }
        return Scaled;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ToScale = new ArrayList<>();

        ToScale.add(4);
        ToScale.add(1);
        ToScale.add(2);
        ToScale.add(0);
        ToScale.add(3);

            System.out.print(ScaleByK(ToScale));
}}
