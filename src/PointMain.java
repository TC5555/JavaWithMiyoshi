import java.util.*;

public class PointMain {
    public static void main(String[] args) {
        ArrayList<PointClass> Point = new ArrayList<>();

            Random Ran = new Random();
            for(int i = 0; i < 2; i++){
            PointClass p = new PointClass(Ran.nextInt(100), Ran.nextInt(100));
            Point.add(p); }
            System.out.println(Point.get(0) + " " + Point.get(1));
            switch (Point.get(0).compareTo(Point.get(1))) {
                case -1:
                    System.out.println(Point.get(0) + " is less than " + Point.get(1));
                    break;
                case 1:
                    System.out.println(Point.get(1) + " is less than " + Point.get(0));
                    break;
                case 0:
                    System.out.println(Point.get(0) + " is equal to " + Point.get(1));
                    break;
            }
        }

    }
