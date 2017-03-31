package Polymorphism;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class StudentPoly extends PersonPoly
{
private String Subject;

    public StudentPoly() {
    }

    public StudentPoly(String Name, String Surname)
    {
        super(Name,Surname);
    //    setSubject(Sub);
    }

    public String getSubject()
    {
        return Subject;
    }

    public void setSubject(String subject)
    {
        Subject = subject;
    }


}
