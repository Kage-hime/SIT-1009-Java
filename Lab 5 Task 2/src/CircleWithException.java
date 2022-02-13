public class CircleWithException
{
    float radius;

    public void setRadius(float radius)
    {
        try
        {
            if (radius <= 0)
            {
                throw new IllegalArgumentException();
            }
            else
                this.radius = radius;

        }
        catch(IllegalArgumentException illegalArgumentException)
        {
            System.out.println(illegalArgumentException + ": Radius cannot be negative");
        }
        finally
        {
            System.out.println("this is from finally");
        }

    }

    public float getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        try
        {
            if (this.radius * this.radius * Math.PI > 1000)
            {
                throw new Exception();
            }
            else
                return this.radius * this.radius * Math.PI;

        }
        catch(Exception exception)
        {
            System.out.println(exception + ": area cannot be bigger than 1000");
        }

        return this.radius * this.radius * Math.PI;
    }

    public float getDiameter()
    {
        return 2 * this.radius;
    }

}
