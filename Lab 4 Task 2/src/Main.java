class Main
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c=new Circle(5,5);
        Ellipse e=new Ellipse(7,7);
        Square s=new Square(6,6);
        Shape figref;

        figref = r;
        System.out.printf("Area is %.1f%n",figref.area());
        figref = t;
        System.out.printf("Area is %.1f%n",figref.area());
        figref = c;
        System.out.printf("Area is %.1f%n",figref.area());
        figref = e;
        System.out.printf("Area is %.1f%n",figref.area());
        figref = s;
        System.out.printf("Area is %.1f%n",figref.area());

    }
}