package GoodLSPTest;

import LSPGood.GroupA;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.security.acl.Group;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class GroupATest extends TestCase
{
    private GroupA GrA;
    @Before
    public void setUp() throws Exception {
        GrA = new GroupA();

    }

    @Test
    public void testNumberOfStudents() throws Exception
    {
        assertEquals(GrA.NumberOfStudents(),30);

    }


}
