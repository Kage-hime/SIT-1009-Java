public class Manager extends Employee
{
    int handlingEmployees;

    public Manager(String name, int age, int eid, int handlingEmployees)
    {
        super(name,age,eid);
        this.handlingEmployees = handlingEmployees;
        this.baseSalary = 5000;

    }
    @Override
    public double calculateSalary()
    {
        return baseSalary + (handlingEmployees * 0.75);
    }

    @Override
    public void printInfo()
    {

    }
}
