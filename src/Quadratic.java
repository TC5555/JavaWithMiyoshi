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
        System.out.println(posequation(1,-7,12) + " " + negequation(1,-7,12));
    }
}
