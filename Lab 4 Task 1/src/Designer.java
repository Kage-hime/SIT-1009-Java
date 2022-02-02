public class Designer extends Employee
{
    int noOfDesigns;

    public Designer(String name, int age, int eid, int noOfDesigns)
    {
        super(name,age,eid);
        this.noOfDesigns = noOfDesigns;
        this.baseSalary = 2500;

    }

    @Override
    public double calculateSalary() {
        return baseSalary + (noOfDesigns * 0.5);
    }


    @Override
    public void printInfo()
    {

    }
}
