public class SumToMain {
    public static double SumTo(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("negative input: " + a);

        }
        else if (a == 0) { return a;
        } else {
            return 1.0/a + SumTo(a-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(SumTo(2));
    }
}
