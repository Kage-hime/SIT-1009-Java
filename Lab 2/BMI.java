import java.util.Scanner;

class BMI
{
    double weight,height;

    public BMI(double w, double h)
    {
        this.weight = w;
        this.height = h;
    }

    public double calcBMI()
    {
        return ((this.weight* 703)/(this.height * this.height));
    }

    public void BMIcategory()
    {
        if ( calcBMI() < 18.5)
        {
            System.out.println("Underweight");
        }
        else if ( calcBMI() < 25)
        {
            System.out.println("Normal");
        }
        else if ( calcBMI() < 30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
    }

}

class Main
{
    public static void main(String[] args)
    {
        Scanner nibba = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double w = nibba.nextDouble();
        System.out.println("Enter height in inches:");
        double h = nibba.nextDouble();
        BMI dumbass = new BMI(w,h);
        System.out.println(String.format("The BMI is %.2f",dumbass.calcBMI()));
        dumbass.BMIcategory();

    }


}
