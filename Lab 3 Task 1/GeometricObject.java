
public class GeometricObject
{
    String color;
    boolean filled;

    public GeometricObject()
    {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String newcolor)
    {
        this.color = newcolor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}




