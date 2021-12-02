public class RectangularPrism implements ShapeInterface3d {
    double length;
    double width;
    double height;

    public RectangularPrism(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getSurfaceArea() {
        return length * height * 2.0 + width * height * 2.0 + length * width * 2.0;
    }
    public double getVolume() {
        return length * width * height;
    }
}
