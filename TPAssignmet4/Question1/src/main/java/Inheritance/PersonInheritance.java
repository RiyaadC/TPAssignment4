package Inheritance;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class PersonInheritance
{

    private String Name;
    private String Surname;

    public PersonInheritance(String name, String surname)
    {
        Name = name;
        Surname = surname;
    }

    public PersonInheritance()
    {

    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getSurname()
    {
        return Surname;
    }

    public void setSurname(String surname)
    {
        Surname = surname;
    }

    @Override
    public String toString()
    {
        return "PersonInheritance{" + "Name='" + Name + '\'' + ", Surname='" + Surname + '\'' + '}';
    }
}
