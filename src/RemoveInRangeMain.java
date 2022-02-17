import java.util.Iterator;
import java.util.LinkedList;

public class RemoveInRangeMain {

    public static LinkedList<Character> RemoveInRange(LinkedList<Character> List, Character ToRemove, int Start, int End) {
        Iterator<Character> Remover = List.iterator();
        while (Start != 0) {
            Start--;
            End--;
            Remover.next();
        }

        while (Remover.hasNext() && (End != 1)) {
            Character CouldRemove = Remover.next();
            if (CouldRemove == ToRemove) {
                Remover.remove();
            }
            End--;
        }
        return List;

    }

    public static void main(String[] args) {
        LinkedList<Character> List = new LinkedList<>();
        List.add('H');
        List.add('e');
        List.add('l');
        List.add('l');
        List.add('o');

        List.add('W');
        List.add('o');
        List.add('r');
        List.add('l');
        List.add('d');

        System.out.print(RemoveInRange(List, 'l', 3, 8));
    }
}
