package OCPTestBad;

import OCPBad.Payment;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class BadTest extends TestCase
{
    private Payment pay = new Payment();

    @Test
    public void testPaymentMethod()
    {

        assertEquals( pay.voucher(),"voucher payment");
    }

}
