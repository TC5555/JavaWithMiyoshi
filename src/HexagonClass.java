public class HexagonClass implements ShapeInterface {
    double side;
    public HexagonClass(double side)
    {
        this.side = side;
    }
    public double getArea() {
        return (3 * Math.sqrt(3) * side * side) / 2.0;
    }
    public double getPerimeter() {
        return side * 6;
    }
}
