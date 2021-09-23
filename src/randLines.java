import java.util.Random;

public class randLines {
    public static void main(String[] args) {
           Random r1 = new Random(), r2 = new Random(), r3 = new Random();
           String rstr;
           for (int i = 0; i < r1.nextInt(5) + 5; i++) {
               rstr = "";
               for (int j = 0; j < r1.nextInt(80); j++) {
                   rstr = rstr + (char)(r3.nextInt(25) + 97);
               }
              System.out.println(rstr);
           }
    }
}
