public class Sphere implements ShapeInterface3d {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return Math.PI * 4.0 * Math.pow(radius, 2.0);
    }
    public double getVolume() {
        return Math.PI * (4.0/3.0) * Math.pow(radius, 3.0);
    }
}
