public class repl {
    public static String rep(String tocount, int countnum){
        String countproduct = "";
        for(int i = 0; i < countnum; i++) {
            countproduct = countproduct + tocount;
        }
        return countproduct;
    }
    public static void main(String[] args) {
        int countnum = 5;
        String tocount = "Hello";
        System.out.println(rep(tocount, countnum));

    }
}
