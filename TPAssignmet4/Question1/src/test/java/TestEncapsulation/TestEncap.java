package TestEncapsulation;

import Encapsulation.Person;
import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestEncap extends TestCase
{
    Person p1 = new Person("Riyaad","Cader");

    public void testPersonName() throws Exception
    {
        assertEquals(p1.getName(),"Riyaad");
    }

    public void testPersonSuname() throws Exception
    {
        assertEquals(p1.getSurname(),"Cader");
    }
}
