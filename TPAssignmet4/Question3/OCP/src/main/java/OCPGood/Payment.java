package OCPGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class Payment implements PayInterface
{

    public String PaymentType(String pay)
    {
        if (pay == "cash")
            return "cash payment";
        else if (pay == "card")
            return "card payment";
        else if (pay == "voucher")
            return "voucher payment";
        else
            return "no client";
    }

}
