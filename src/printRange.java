public class printRange {
    public static String rang(int num1, int num2) {
        String output = "[";
        if(num1 > num2 ) {
            for(int i = num1; i > num2; i--) {
                output = output + i + ", ";
            }}
        output = output + num2 + "]";
        return output;
    }
    public static void main(String[] args) {
        int num1 = 19, num2 = 11;
        System.out.println(rang(num1, num2));
    }
}
