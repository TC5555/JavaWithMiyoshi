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
for(int i = 1; i <= 10; i++) {
        WNums(i);
        System.out.println();
}
    }
}
