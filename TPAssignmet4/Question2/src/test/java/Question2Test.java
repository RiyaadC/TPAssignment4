import AppConf.AppConfig;
import Inheritance.Actions;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static junit.framework.Assert.assertEquals;
//import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;


/**
 * Created by Riyaad on 3/29/2017.
 */
public class Question2Test
{
    private Actions a;
    private Actions b;
    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        a = (Actions)ctx.getBean("stud");

        ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        b = (Actions)con.getBean("emp");
    }
    @Test
    public void Studenttest() throws Exception
    {
        assertEquals(a.eat(),"Eat healthy");
    }

    @Test
    public void Employeetest() throws Exception
    {
        assertEquals(b.eat(),"dsdssd");
    }
}
