public class Cube implements ShapeInterface3d {
    double side;

    public Cube(double side) {
        this.side = side;
    }
    public double getSurfaceArea() {
        return side * side * 6.0;
    }
    public double getVolume() {
        return Math.pow(side, 3.0);
    }
}
