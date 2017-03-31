package Inheritance;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class StudentInheritance extends PersonInheritance implements Actions
{


    public StudentInheritance()
    {

    }

    public StudentInheritance(String name, String Surname)
    {
        super(name,Surname);

    }


    public String eat()
    {
        return "Eat junk";
    }
}
