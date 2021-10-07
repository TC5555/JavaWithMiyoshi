
public class Substrings {
    public static void SubS(String a, int b) {
        String[] output = new String[a.length() / b];
        int i;
        for(i = 0; i < a.length() / b; i++) {
            int bi = b * i;
            String ASub = a.substring(bi, b + bi);
            output[i] = ASub; }
        int bi = b * i;
        for(int j = 0; j < a.length() / b; j++) {
            System.out.println(output[j]); }
        System.out.println(a.substring(bi));
    }

    public static void main(String[] args) {
        String a = "qwert";
        int b = 2;
        SubS(a, b);
    }
}