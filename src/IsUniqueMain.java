import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsUniqueMain {
    public static boolean IsUnique(Map<String, String> CouldUnique) {
        Set<String> Val = new HashSet<>(CouldUnique.values());
            return Val.size()==CouldUnique.size();
    }
    public static void main(String[] args) {
        Map<String, String> CouldUnique = new HashMap<>();
        CouldUnique.put("dog", "dog");
        CouldUnique.put("cat", "dog");

        System.out.print(IsUnique(CouldUnique));
    }
}
