public class RecursiveFibonacciSeries {
    public static void Fibonacci(int i, int e, int a) {
        if(a==0){}
            else {
            System.out.print(i + " " + e + " ");
            Fibonacci(i + e, i+e+e, a-1);
        }

    }
        public static void main(String[] args) {
        Fibonacci(1,1,6);
    }
}
