import java.util.*;

public class minToFront {
    public static void main(String[] args) {
        ArrayList<Integer> ToFront = new ArrayList<>();

        ToFront.add(3);
        ToFront.add(8);
        ToFront.add(92);
        ToFront.add(4);
        ToFront.add(2);
        ToFront.add(17);
        ToFront.add(9);

        int minCount = 0;
        int index = -1;
        while (minCount != ToFront.size() - 1) {
            index++;
            minCount = 0;
            for (int j = 0; j < ToFront.size(); j++) {
                if (ToFront.get(index) < ToFront.get(j)) {
                    minCount++;
                }
            }
        }
        int min = ToFront.get(index);
        ToFront.remove(index);
        ToFront.add(0, min);
        System.out.print(ToFront);
    }
}
