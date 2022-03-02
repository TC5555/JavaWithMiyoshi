public class PointCompare {
    public static int compare(PointClass a, PointClass b) {
        return (int) Math.round(Math.sqrt(a.x * a.x + a.y * a.y) - Math.sqrt(b.x * b.x + b.y * b.y));
    }
}
