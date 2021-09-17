public class Triangle {

    public static double angleA(double a, double b, double c) {
        double cosine, angle;
        cosine = ((c * c) - ((a * a) + (b * b))) / (-2 * a *b);
        angle = Math.acos(cosine);
        return angle;
    }

    public static void main(String[] args) {
        double a = 10, b = 4, c = 7;
        double answer = angleA(a, b, c);
        System.out.print(answer + " success");
    }


}
