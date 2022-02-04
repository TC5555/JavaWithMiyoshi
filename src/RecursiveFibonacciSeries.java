public class RecursiveFibonacciSeries { //decided to do documentation. I'm going to try to do this in following code. it helps me understand the code better if I look at it later on and probably helps you understand it.
    public static long FibonacciInit(long a) { //this method will initialize the recursive function and do some error checking. Its main benefit is that it preforms error checking in a non-recursive method. This code works very different to the code presented in BJP.
            if(a< 1) {
                throw new IllegalArgumentException("Invalid input: " + a);
            }
        else {
            long fib = Fibonacci(1,1,a-1, a-1); //-1 moves the series to the right, so it will go 1 1 2 3 rather than 1 2 3 5.
                if(fib< 1) {
                    throw new ArithmeticException("Overflow output: " + fib); //is arithmetic exception the right one to throw? it seems like it's the most accurate because overflow is the result of arithmetic and is undesired in the problem.
                }
            return fib;
        }
    }
    public static long Fibonacci(long i, long e, long a, long OrigA) {
        if(a==0){ if(OrigA%2 == 0) {return i;} // the point of OrigA is shown here. i and e swap every other output, so it returns the proper sums of the method in proper order. I printed 2 at a time in the previous version of this code and my original fibonacci assignment because it's more efficient. this code is less efficient when printing out the series but can give any output in the series if given the number of it.
        return e;}
        else {
           if(a%2 == 0) { //this is so i ane e only increment every other loop, so it doesn't skip over outputs.
                return Fibonacci(i + e, i+e+e, a-1,OrigA);
            }
           return Fibonacci(i, e, a-1,OrigA);

        }
    }
        public static void main(String[] args) {
        for(long a = 1; a <= 92; a++) { //93 will be the first operation causing overflow for the long. It adds 4660046610375530309 and 7540113804746346429 together. The sum will exceed 9223372036854775807, causing overflow.
            System.out.print(FibonacciInit(a) + " ");
        }
    }
}