import java.util.*;

public class SortAndRemoveDuplicatesMain {
    public static LinkedList<Integer> SortAndRemoveDuplicates(LinkedList<Integer> List) {

        Set<Integer> Set = new HashSet<>(List);
        LinkedList<Integer> SortedList = new LinkedList<>(Set);
        Collections.sort(SortedList);

        return SortedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> List = new LinkedList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(44);
        List.add(62);

        List.add(-1);
        List.add(-2);
        List.add(52);
        List.add(66);
        List.add(0);

        System.out.print(SortAndRemoveDuplicates(List));
    }
}
