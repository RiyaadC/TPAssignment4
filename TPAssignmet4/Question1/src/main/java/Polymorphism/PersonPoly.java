package Polymorphism;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class PersonPoly
{

    private String Name;
    private String Surname;

    public PersonPoly()
    {

    }

    public PersonPoly(String name, String surname)
    {
        Name = name;
        Surname = surname;
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
