package ISPTestBad;

import AppConfiguration.AppConf;
import ISPBad.SamsungPhone;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestBadISP extends TestCase
{
    private ApplicationContext ctx;
    private SamsungPhone sam;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConf.class);
        sam = (SamsungPhone)ctx.getBean("Samsung");
    }
    @Test
    public void testSamsungMakeCall() throws Exception {
        assertEquals(sam.makePhoneCall(),"Number is being dialled");
    }

    @Test
    public void testSamsungReceiveCall() throws Exception {
        assertEquals(sam.receiveCall(),"You are receiving a call!");
    }

    @Test
    public void testSamsungSendText() throws Exception {
        assertEquals(sam.sendText(),"Send a message");
    }


    @Test
    public void testSamsungReceiveText() throws Exception {
        assertEquals( sam.receiveText(),"You have received an SMS");
    }




}
