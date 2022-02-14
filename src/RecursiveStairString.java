public class RecursiveStairString {
    public static void starString(int a) {
        if(a==0) {System.out.print("*");}
        else {
            starString(a-1);
            starString(a-1);
            /*
            this code will branch off twice for every
             */
        }
    }

    public static void main(String[] args) {
        starString(4);
    }
}
