import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// The description of the assignment is a little loose. It sounds like I could just do .sort because the order doesn't matter but that's obviously not what's being asked.
public class PartitionMain {
    public static List<Integer> Partition (List<Integer> ToPar, int E) {
        Iterator<Integer> Partitioner = ToPar.iterator();
        List<Integer> Partitioned = new ArrayList<>(ToPar);
        while(Partitioner.hasNext()) {
            Integer CouldPar = Partitioner.next();
            if(CouldPar > E) {
                Partitioned.remove(CouldPar);
                Partitioned.add(CouldPar);
            }
        }
        return Partitioned;
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
        List.add(21);
        List.add(2);
        List.add(30);
        List.add(-1);
        List.add(9);

        System.out.print(Partition(List, 5));
    }
}
