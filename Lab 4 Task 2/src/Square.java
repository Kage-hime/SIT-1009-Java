public class Square implements Shape
{
    int dim1,dim2;

    public Square(int side, int side2)
    {
        this.dim1=side;
        this.dim2=side2;
    }

    @Override
    public double area()
    {
        System.out.println("Inside Area for Square.");
        return dim1*dim2;
    }
}
