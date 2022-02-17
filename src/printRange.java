public class printRange {
    public static String range(int num1, int num2) {
        String output = "[";
        if(num1 > num2 ) {
            for(int i = num1; i > num2; i--) {
                output = output + i + ", ";
            }}
        else if(num1 < num2) {
            for(int i = num1; i < num2; i++) {
                output = output + i + ", ";
            }
        }
        output = output + num2 + "]";

        return output;
    }
    public static void main(String[] args) {
        int num1 = 19, num2 = 32;
        System.out.println(range(num1, num2));
    }
}
