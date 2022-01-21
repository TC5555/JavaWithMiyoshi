import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountUniqueMain {
    public static int CountUnique(List<Integer> CouldUnique) {
        Set<Integer> Uniquifier = new HashSet<>(CouldUnique);
        return Uniquifier.size();
    }

    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List.add(15);
        List.add(1);
        List.add(6);
        List.add(12);
        List.add(-3);
        List.add(4);
        List.add(8);
        List.add(2);
        List.add(2);
        List.add(30);
        List.add(-1);
        List.add(1);

        System.out.print(CountUnique(List) + " " + List.size());
    }
}
