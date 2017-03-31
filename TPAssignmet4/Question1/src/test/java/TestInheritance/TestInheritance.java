package TestInheritance;

import Inheritance.StudentInheritance;
import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestInheritance extends TestCase
{
    StudentInheritance s1 = new StudentInheritance("Riyaad","Cader");

    public void testStudentName() throws Exception
    {
        assertEquals(s1.getName(),"Riyaad");
    }

    public void testStudentSurname() throws Exception
    {
        assertEquals(s1.getSurname(),"Cader");
    }
}
