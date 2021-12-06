import java.util.Scanner;
public class ThreeDimensionalShapeMain {
    public static void main(String[] args) {
        while(true) {
            int choice;
            Scanner console = new Scanner(System.in);

            System.out.println("Sphere(1), RectangularPrism(2), Cube(3), Cylinder(4), or Cone(5)");
            choice = console.nextInt();
            switch (choice) {
                case 1: {
                    double Radius;
                    System.out.println("Radius of sphere?");
                    Radius = console.nextDouble();
                    Sphere MainSphere = new Sphere(Radius);
                    System.out.println("Volume: " + MainSphere.getVolume() + "\nSurface area: " + MainSphere.getSurfaceArea());
                }
                    break;
                case 2: {
                    double Length, Height, Width;
                    System.out.println("Height of rectangular prism?");
                    Height = console.nextDouble();

                    System.out.println("Length of rectangular prism?");
                    Length = console.nextDouble();

                    System.out.println("Width of rectangular prism?");
                    Width = console.nextDouble();

                    RectangularPrism MainRectangularPrism = new RectangularPrism(Length, Width, Height);
                    System.out.println("Volume: " + MainRectangularPrism.getVolume() + "\nSurface area: " + MainRectangularPrism.getSurfaceArea());
                }
                    break;
                case 3: {
                    double Side;
                    System.out.println("Side Length of Cube?");
                    Side = console.nextDouble();

                    Cube MainCube = new Cube(Side);
                    System.out.println("Volume: " + MainCube.getVolume() + "\nSurface area: " + MainCube.getSurfaceArea());
                }
                    break;
                case 4: {
                    double Height, Radius;

                    System.out.println("Height of Cylinder?");
                    Height = console.nextDouble();

                    System.out.println("Radius of Cylinder?");
                    Radius = console.nextDouble();

                    Cylinder MainCylinder = new Cylinder(Radius, Height);
                    System.out.println("Volume: " + MainCylinder.getVolume() + "\nSurface area: " + MainCylinder.getSurfaceArea());
                }
                    break;
                case 5: {
                    double Height, Radius;
                    System.out.println("Height of Cone?");
                    Height = console.nextDouble();

                    System.out.println("Radius of Cone?");
                    Radius = console.nextDouble();

                    Cone MainCone = new Cone(Radius, Height);
                    System.out.println("Volume: " + MainCone.getVolume() + "\nSurface area: " + MainCone.getSurfaceArea());
                }
                    break;
            }
        }
        }
}
