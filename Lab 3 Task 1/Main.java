import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius:");
        double rad = scanner.nextDouble();
        Circle circle =  new Circle(rad);
        System.out.println("The color is "+ circle.getColor());
        System.out.println("The radius is "+ circle.getRadius());
        System.out.println("The area is "+ circle.getArea());
        System.out.println("The diameter is "+ circle.getDiameter());

        System.out.println("Enter length of rectangle:");
        double len = scanner.nextDouble();
        System.out.println("Enter breadth of rectangle:");
        double br = scanner.nextDouble();

        Rectangle rectangle =  new Rectangle(len,br);
        System.out.println("The area is "+ rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());



        scanner.close();

    }
}