public class Main
{
    public static void main(String[] args)
    {
        CircleWithException test = new CircleWithException();

        test.setRadius(5);

        test.setRadius(1000);
        test.getArea();

        test.setRadius(-5);

    }
}
