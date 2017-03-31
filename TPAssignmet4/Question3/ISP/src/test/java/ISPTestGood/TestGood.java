package ISPTestGood;

import AppConfiguration.AppConf;
import ISPGood.ApplePhone;
import ISPGood.SonyPhone;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class TestGood extends TestCase
{
    private ApplicationContext ctx;
    private ApplePhone app;
    private SonyPhone son;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConf.class);
        app = (ApplePhone) ctx.getBean("Apple");
        son = (SonyPhone) ctx.getBean("Sony");
    }


    @Test
    public void testAppleMakeCall() throws Exception {
        assertEquals(app.makePhoneCall(),"Number is being dialled");
    }

    @Test
    public void testAppleReceiveCall() throws Exception {
        assertEquals(app.receiveCall(),"You are receiving a call!");
    }

    @Test
    public void testAppleSendText() throws Exception {
        assertEquals(app.sendText(),"Send a message");
    }


    @Test
    public void testAppleReceiveText() throws Exception {
        assertEquals( app.receiveText(),"You have received an SMS");
    }

    @Test
    public void testSonyMakeCall() throws Exception {
        assertEquals("Number is being dialled",son.makePhoneCall());
    }

    @Test
    public void testSonyReceiveCall() throws Exception {
        assertEquals("You are receiving a call!",son.receiveCall());
    }

    @Test
    public void testSonySendText() throws Exception {
        assertEquals("Send a message",son.sendText());
    }


    @Test
    public void testSonyReceiveText() throws Exception
    {
        assertEquals( "You have received an SMS",son.receiveText());
    }
}
