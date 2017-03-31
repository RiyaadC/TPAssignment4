package DIPTestGood;

import AppConfiguration.AppConfig;
import DIPGOOD.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Riyaad on 3/30/2017.
 */
public class TestGood
{
    private Animal s;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        s = (Animal)ctx.getBean("Good");
    }

    @After
    public void tearDown() throws Exception
    {

        ctx = null;
        s  = null;
    }

    @Test
    public void testCatSound() throws Exception
    {
        assertEquals(s.CatSound(),"Meow");
    }

    @Test
    public void testDogSound() throws Exception
    {
        assertEquals(s.DogSound(),"Woof");
    }
}
