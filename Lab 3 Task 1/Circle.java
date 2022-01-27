import java.lang.Math;

public class Circle extends GeometricObject
{
    double radius;

    public Circle()
    {
        color = "white";
        filled = false;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;

    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter()
    {
        return Math.PI * (2 * radius);
    }

    public double getDiameter()
    {
        return (2 * radius);

    }

}
