import java.util.*;

public class RemoveEvenLengthMain {
    public static Set<String> removeEvenLength(Set<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String element = i.next();
            if (element.length() % 2 == 0) {
                i.remove();
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Set<String> List = new HashSet<>();
        List.add("Hello");
        List.add("World");
        List.add("my");
        List.add("name");
        List.add("is");
        List.add("tyler");

        System.out.print(removeEvenLength(List));
    }
}
