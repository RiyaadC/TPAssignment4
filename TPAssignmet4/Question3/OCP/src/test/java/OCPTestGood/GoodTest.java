package OCPTestGood;

import OCPGood.Client;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class GoodTest extends TestCase
{

    private Client pay = new Client();

    @Test
    public void testPaymentMethod()
    {

        assertEquals(pay.payment("cash"),"cash payment" );
    }
}
