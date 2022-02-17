public class WriteSequence {
    public static void WSequence(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("negative input: " + a);
        } else if (a == 1) {
            System.out.print(1 + " ");
        } else if (a > 1) {
             System.out.print(Math.round(a/2.0) + " ");
            WSequence(a - 2);
            System.out.print(Math.round(a/2.0) + " ");
        }
    }


    public static void main(String[] args) {

        WSequence(5);
    }
}