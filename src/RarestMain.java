import java.util.*;

public class RarestMain {
    public static int Rarest(Map<String, Integer> Steak) {
        List<Integer> Val = new ArrayList<>(Steak.values());
        Collections.sort(Val);
        Collections.reverse(Val);
        System.out.print(Val);
        int MostRareAmount = Val.size(), WasRare = 0, RareAmount = 0, MostRare = 0;
        boolean S = false;
        for (int Rare : Val) {
            if (S) {
                if (Rare == WasRare) {
                    RareAmount++;
                } else {
                    if (RareAmount <= MostRareAmount) {
                        MostRareAmount = RareAmount;
                        MostRare = WasRare;
                    }
                    RareAmount = 0;
                }
            }
            WasRare = Rare;
            S = true;
        }
        if(RareAmount <= MostRareAmount) {
            MostRare=WasRare;
        }

        return MostRare;
    }
    public static void main(String[] args) {
        Map<String, Integer> CouldUnique = new HashMap<>();
        CouldUnique.put("dog", 2);
        CouldUnique.put("cat", 2);
        CouldUnique.put("cow", 6);
        CouldUnique.put("rat", 3);
        CouldUnique.put("mat", 5);
        CouldUnique.put("sat", 8);
        CouldUnique.put("hat", 13);
        CouldUnique.put("sad", 245);
        CouldUnique.put("him", 13);
        CouldUnique.put("her", 5);
        CouldUnique.put("the", 6);
        CouldUnique.put("eat", 1);
        CouldUnique.put("you", 1);

        System.out.print(Rarest(CouldUnique));
    }
}
