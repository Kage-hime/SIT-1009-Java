public class Ellipse implements Shape
{
    int dim1,dim2;

    public Ellipse(int major, int minor)
    {
        this.dim1=major;
        this.dim2=minor;
    }

    @Override
    public double area()
    {
        System.out.println("Inside Area for Ellipse.");
        return Shape.pi * dim1 * dim2;
    }
}
