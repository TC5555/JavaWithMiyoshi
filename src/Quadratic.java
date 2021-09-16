public class Quadratic {

    import java.util.

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
        double a, b, c;

        System.out.println(a + " " + b + " " + c);

        System.out.println("X = " + posequation(a,b,c) + ", X = " + negequation(a,b,c));
    }
}
