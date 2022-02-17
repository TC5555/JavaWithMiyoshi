public class writeNums {
    public static void WNums(int a) {
        if(a<0) {    throw new IllegalArgumentException("negative input: " + a);}
        else if(a==0){}
        else {
            WNums(a-1);
            if(a==1) {
                System.out.print(a);
            }
            else System.out.print(", " + a);
        }
    }


    public static void main(String[] args) {

        WNums(5);
    }
}
