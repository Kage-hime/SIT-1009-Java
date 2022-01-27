
public class Rectangle extends GeometricObject
{
    double width,height;

    public Rectangle()
    {

    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return (2* width) + (2*height);
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }



}