public class Circle implements Shape
{
    int dim1, dim2;

    public Circle(int radius, int radius2)
    {
        this.dim1 = radius;
        this.dim2 = radius2;
    }

    @Override
    public double area()
    {
        System.out.println("Inside Area for Circle.");
        return Shape.pi * (dim1 * dim1);
    }
}
