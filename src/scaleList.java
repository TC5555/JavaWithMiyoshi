import java.util.*;

public class scaleList {
    public static void main(String[] args) {
        ArrayList<Integer> ToScale = new ArrayList<>();
        ArrayList<Integer> Scaled = new ArrayList<>();
        int k;
        ToScale.add(4);
        ToScale.add(1);
        ToScale.add(2);
        ToScale.add(0);
        ToScale.add(3);
        for(int i = 0; i < ToScale.size(); i++) {
            k=ToScale.get(i);
            System.out.println(k);
            for(int j = 0; j < k; j++) {
             Scaled.add(k);
            }
    }
            System.out.print(Scaled);
}}
