public class Cone {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return Math.PI *  Math.pow(radius, 2.0) + Math.PI * radius * Math.sqrt(Math.pow(radius, 2.0)+Math.pow(height, 2.0));
    }
    public double getVolume() {
        return Math.PI * height * (1.0/3.0) * Math.pow(radius, 2.0);
    }
}

