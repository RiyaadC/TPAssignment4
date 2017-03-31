package BadLSPTest;

import LSPBad.GroupA;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestGroupA extends TestCase
{
    private GroupA GrA;

    @Before
    public void setUp() throws Exception {
        GrA = new GroupA();

    }

    @Test
    public void testNumberOfStudents() throws Exception {
        GrA.setNumberOfStudents(30);
        assertEquals( GrA.getNumberOfStudents(),30);

    }
}
