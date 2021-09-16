
import java.util.*;

public class Quadratic {

    public static double posequation(double a, double b, double c) {
        double answer;
        answer = ((-1 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        return answer;
    }

    public static double negequation(double a, double b, double c) {
        double answer;
        answer = ((-1 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        return answer;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("a = ");
        double a = console.nextDouble();

        System.out.print("b = ");
        double b = console.nextDouble();

        System.out.print("c = ");
        double c = console.nextDouble();

        System.out.println(a + "x + " + b + " + " + c);
        System.out.println("x = " + posequation(a,b,c) + ", x = " + negequation(a,b,c));
    }
}
