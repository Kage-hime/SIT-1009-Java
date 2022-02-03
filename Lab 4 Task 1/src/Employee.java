public abstract class Employee
{
    int eid,age;
    String name;
    double baseSalary;

    public Employee(String name, int age , int eid)
    {
        this.eid = eid;
        this.name = name;
        this.age = age;
    }

    public void orientation(){}
    public void printInfo(){}
    public abstract double calculateSalary();

}
