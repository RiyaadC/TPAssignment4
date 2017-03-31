package TestPolymorphism;

import Inheritance.PersonInheritance;
import Inheritance.StudentInheritance;
import Polymorphism.EmployeePoly;
import Polymorphism.PersonPoly;
import Polymorphism.StudentPoly;
import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestPolymorphism extends TestCase
{
    PersonPoly p1 = new EmployeePoly("Riyaad","Cader");
    PersonPoly p2 = new StudentPoly("John","Cena");

    public void testEmployeeName() throws Exception
    {
        assertEquals(p1.getName(),"Riyaad");
    }

    public void testEmployeeSurname() throws Exception
    {
        assertEquals(p1.getSurname(),"Cader");
    }

    public void testStudentName() throws Exception
    {
        assertEquals(p2.getName(),"John");
    }

    public void testStudentSurname() throws Exception
    {
        assertEquals(p2.getSurname(),"Cena");
    }

}
