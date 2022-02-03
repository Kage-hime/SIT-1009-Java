public class Triangle implements Shape
{
    int dim1, dim2;

    public Triangle(int height, int width)
    {
        this.dim1 = height;
        this.dim2 = width;
    }

    @Override
    public double area()
    {
        System.out.println("Inside Area for Triangle.");
        return 0.5 * dim1 * dim2;
    }
}
