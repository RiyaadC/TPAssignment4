package Inheritance;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class Employee extends PersonInheritance implements Actions
{
    public Employee() {

    }

    public Employee(String Name, String Surname)
    {
        super(Name,Surname);
    }

    public String eat()
    {
        return "Eat healthy";
    }

}
