package Polymorphism;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class EmployeePoly extends PersonPoly
{
    public int Salary;

    public EmployeePoly(String Name, String Surname)
    {
        super(Name,Surname);
        //setSalary(Sal);
    }

    public int getSalary()
    {
        return Salary;
    }

    public void setSalary(int salary)
    {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePoly{" +
                "Salary=" + Salary +
                '}';
    }
}
