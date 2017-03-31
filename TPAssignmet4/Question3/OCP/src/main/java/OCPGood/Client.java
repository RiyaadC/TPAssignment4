package OCPGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class Client
{
    private PayInterface PI = new Payment();


    public String payment(String pm)
    {
        return PI.PaymentType(pm);
    }


}
