public class MultiplyE {
    public static int multiplyEvens(int inp){
        int out = 2*inp;
        if(inp > 1){
        out *= multiplyEvens(inp-1);}
        if(inp < 1){
            throw new IllegalArgumentException("");
        }
        return out;
    }
    public static void main(String[] args){
        System.out.print(multiplyEvens(6));
    }
}
