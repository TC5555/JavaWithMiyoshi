import java.util.*;

public class Triangle {

        public static double angleA(double a, double b, double c) {
        double cosine, angle;
        cosine = ((c * c) - ((a * a) + (b * b))) / (-2 * a * b);
        angle = Math.toDegrees(Math.acos(cosine));
        return angle;
    }

    public static double angleB(double a, double b, double c) {
        double cosine, angle;
        cosine = ((b * b) - ((a * a) + (c * c))) / (-2 * a * c);
        angle = Math.toDegrees(Math.acos(cosine));
        return angle;
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("a = ");
        double a = console.nextDouble();

        System.out.print("b = ");
        double b = console.nextDouble();

        System.out.print("c = ");
        double c = console.nextDouble();

        double answer1 = angleA(a, b, c), answer2 = angleB(a, b, c);
        System.out.println("angle a = " + answer1 + " angle b = " + answer2 + " angle c = " + (180 - (answer1 + answer2)));
    }
}
