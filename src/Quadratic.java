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
        System.out.println("X = " + posequation(1,-7,12) + ", X = " + negequation(1,-7,12));

        System.out.println("X = " + posequation(1,3,2) + ", X = " + negequation(1,3,2));

        System.out.println("X = " + posequation(1,3,2) + ", X = " + negequation(1,3,2));
    }
}
