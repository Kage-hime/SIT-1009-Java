public class Rectangle implements Shape
{
    int dim1, dim2;

    public Rectangle(int length,int height)
    {
        this.dim1 = length;
        this.dim2 = height;
    }

    @Override
    public double area()
    {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
