package BadLSPTest;

import LSPBad.GroupB;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestGroupB extends TestCase
{
    private GroupB GrB;

    @Before
    public void setUp() throws Exception
    {
        GrB = new GroupB();

    }

    @Test
    public void testNumberOfStudents() throws Exception {
        GrB.setNumberOfStudents(30);
        assertEquals( GrB.getNumberOfStudents(),30);

    }

}
