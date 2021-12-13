public class PointClass implements Comparable<PointClass> {
    int x;
    int y;

    public PointClass(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public int compareTo(PointClass other) {
        if (other.y > y) {
            return -1;
        }
        if (other.y < y) {
            return 1; }
        if (other.x > x) {
            return -1;
        }
        if (other.x < x) {
            return 1;
        }
        return 0;
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
