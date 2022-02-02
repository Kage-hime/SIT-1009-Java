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
        System.out.println(String.format("Name of the employee: %s is %d years old. His employee id is: %d. Testing Codes: %d. Developing codes: %d. Salary: %.2f" ,
                this.name,this.age,this.eid,this.testingCodes,this.developingCodes,calculateSalary()));

    }
}
