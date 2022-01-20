public class CalendarClass implements Comparable<CalendarClass> {
    private int year;
    private int month;
    private int day;

    public CalendarClass(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int compareTo(CalendarClass other) {
        if (year != other.year) {
            return year - other.year;
        }
        else if (month != other.month) {
            return month - other.month;
        } else {
            return day - other.day;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }
}