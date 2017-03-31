package DIPTestBad;

import AppConfiguration.AppConf;
import AppConfiguration.AppConfig;
import DIPBAD.Sounds;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestBad extends TestCase
{
    private Sounds s;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
       ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        s = (Sounds)ctx.getBean("Bad");
    }

    @After
    public void tearDown() throws Exception
    {

        ctx = null;
        s  = null;
    }

    public void testCatSound() throws Exception
    {
        assertEquals(s.CatSound(),"Meow");
    }

    public void testDogSound() throws Exception
    {
        assertEquals(s.DogSound(),"Woof");
    }
}
