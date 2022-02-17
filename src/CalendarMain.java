import java.util.*;

public class CalendarMain {
    public static void main(String[] args) {
        ArrayList<CalendarClass> Date = new ArrayList<>();

        Random Ran = new Random();
        for(int i = 0; i < 2; i++){
            CalendarClass c = new CalendarClass(Ran.nextInt(20) + 2000, Ran.nextInt(11) + 1, Ran.nextInt(29) + 1);
            Date.add(c); }
        System.out.println(Date.get(0) + "\t" + Date.get(1));
        if (Date.get(0).compareTo(Date.get(1)) < 0) {
            System.out.println(Date.get(0) + " is before " + Date.get(1));
        }
        else if (Date.get(0).compareTo(Date.get(1)) > 0) {
            System.out.println(Date.get(1) + " is before " + Date.get(0));
        }
        else {
            System.out.println(Date.get(0) + " is the same date as " + Date.get(1));
        }

        if (Date.get(0).getYear() < Date.get(1).getYear()) {
            System.out.println(Date.get(0).getYear() + " is earlier than " + Date.get(1).getYear());
        }
        else if (Date.get(0).getYear() > Date.get(1).getYear()) {
            System.out.println(Date.get(1).getYear() + " is earlier than " + Date.get(0).getYear());
        }
        else {
            System.out.println(Date.get(1).getYear() + " is the same year as " + Date.get(0).getYear());
        }

        if (Date.get(0).getMonth() < Date.get(1).getMonth()) {
            System.out.println(Date.get(0).getMonth() + " is earlier than " + Date.get(1).getMonth());
        }
        else if (Date.get(0).getMonth() > Date.get(1).getMonth()) {
            System.out.println(Date.get(1).getMonth() + " is earlier than " + Date.get(0).getMonth());
        }
        else {
            System.out.println(Date.get(1).getMonth() + " is the same month as " + Date.get(0).getMonth());
        }

        if (Date.get(0).getDay() < Date.get(1).getDay()) {
            System.out.println(Date.get(0).getDay() + " is earlier than " + Date.get(1).getDay());
        }
        else if (Date.get(0).getDay() > Date.get(1).getDay()) {
            System.out.println(Date.get(1).getDay() + " is earlier than " + Date.get(0).getDay());
        }
        else {
            System.out.println(Date.get(1).getDay() + " is the same day as " + Date.get(0).getDay());
        }

        }
    }


