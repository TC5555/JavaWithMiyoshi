import java.util.*;

public class PointMain {
    public static void main(String[] args) {
        ArrayList<PointClass> Point = new ArrayList<>();

            Random Ran = new Random();
            for(int i = 0; i < 2; i++){
            PointClass p = new PointClass(Ran.nextInt(100), Ran.nextInt(100));
            Point.add(p); }
            System.out.println(Point.get(0) + " " + Point.get(1));
        if (Point.get(0).compareTo(Point.get(1)) < 0) {
            System.out.println(Point.get(0) + " is before " + Point.get(1));
        }
        else if (Point.get(0).compareTo(Point.get(1)) > 0) {
            System.out.println(Point.get(1) + " is before " + Point.get(0));
        }
        else {
            System.out.println(Point.get(0) + " is the same coordinate as " + Point.get(1));
        }

        if (PointCompare.compare(Point.get(0), Point.get(1)) < 0) {
            System.out.println(Point.get(0) + " is closer to the origin than " + Point.get(1));
        }
        else if (PointCompare.compare(Point.get(0), Point.get(1)) > 0) {
            System.out.println(Point.get(1) + " is closer to the origin than " + Point.get(0));
        }

    }

    }
