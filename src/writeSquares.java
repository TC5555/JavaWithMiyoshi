public class writeSquares {
    public static void pow(int y) {
        if (y < 0) {
            throw new IllegalArgumentException("negative input: " + y);
        } else if (y == 0) {
        } else if (y % 2 == 0) {
            pow( y-1);
            System.out.print(y*y + " ");
        } else {
            System.out.print(y*y + " ");
            pow(y - 1);
        }
    }
    public static void main(String[] args) {
        pow(8);
    }

}
