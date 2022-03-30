import java.util.*;

public class maxOccurrences {
    public static int maxOccurr(ArrayList<Integer> list) {
        if(list.isEmpty()){
            return 0;
        }
        Map<Integer, Integer> MyMap = new HashMap<>();
        for(int i = 0; i < list.size(); i++) {
            int amount = 0;
            for(int j = 0; j < list.size(); j++) {
            if(list.get(i) == list.get(j)){
                amount++;
            }
            }
            MyMap.put(i,amount);
        }
        return Collections.max(MyMap.values());
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(13);
        list.add(2);
        list.add(2);
        list.add(13);
        list.add(13);
        System.out.println(maxOccurr(list));
    }
}
