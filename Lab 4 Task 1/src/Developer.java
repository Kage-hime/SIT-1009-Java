public class Developer extends Employee
{
    int testingCodes,developingCodes;

    public Developer(String name, int age, int eid, int testingCodes, int developingCodes)
    {
        super(name, age,eid);
        this.testingCodes = testingCodes;
        this.developingCodes = developingCodes;
        this.baseSalary = 3500;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (testingCodes * 0.25) + (developingCodes * 0.5);
    }


    @Override
    public void printInfo()
    {

    }
}
