
public class Substrings {
    public static String[] SubS(String a, int b) {
        String[] output = new String[(a.length() / b) + 1];
        for(int i = 0; i < (a.length() / b) + 1; i++) {
            int bi = b * i;
            String ASub = a.substring(bi, b + bi);
            if (ASub.length() < b + bi) {
                String TooMany = ASub;
                output[i] = TooMany;
                break;
            }
            output[i] = ASub; }
        return output;
    }

    public static void main(String[] args) {
        String a = "qwertyuiopasdfg";
        int b = 7;
        String[] c = SubS(a, b);
        for(int i = 0; i < a.length() / b; i++) {
        System.out.println(c[i]); }
        //System.out.println(a.substring(1,5));
    }
}