package GoodLSPTest;

import LSPBad.GroupB;
import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class GroupBTest extends TestCase
{
    private GroupB GrB;

    @Before
    public void setUp() throws Exception
    {
        GrB = new GroupB();

    }

    public void testGroupB() throws Exception
    {
        assertEquals(GrB.getNumberOfStudents(),25);
    }
}
