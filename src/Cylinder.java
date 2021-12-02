public class Cylinder implements ShapeInterface3d {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return Math.PI * 2.0 * radius * (radius+height);
    }
    public double getVolume() {
        return Math.PI * height * Math.pow(radius, 2.0);
    }
}
