public class PointClass implements Comparable<PointClass> {
    int x;
    int y;

    public PointClass(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public int compareTo(PointClass other) {
        if (y != other.y) {
            return y - other.y;
        }
        else
            return x - other.x;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
