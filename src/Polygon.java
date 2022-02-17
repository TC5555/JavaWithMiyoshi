public class Polygon implements ShapeInterface3d {
    protected double length, width, height;

    public Polygon(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getSurfaceArea() { return 0;}
    public double getVolume() { return 0;}
}
