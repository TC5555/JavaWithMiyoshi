public class stairString {
    public static void SubS(String a, int b) {
        String[] output = new String[b];
        int i;
        for(i = 0; i < b; i++) {
            int al = (a.length() / b) * i;
            int al2 = a.length() / b + al;
            String ASub = a.substring(al, al2);
            output[i] = ASub; }
        int spaces = 0;
        for(int j = 0; j < b; j++) {
            System.out.println();
            for(int k = 0; k < spaces; k++)
            {
                System.out.print(" ");
            }
            System.out.print(output[j]);
            spaces += output[j].length();
        }
        System.out.print(a.substring(a.length() - (a.length() % b)));

    }

    public static void main(String[] args) {
        String a = "Hello my name is tyler";
        int b = 6;
        SubS(a, b);
    }
}
