package PLKGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class First
{

    public String getAccess()
    {
        Second sec = new Second();

        return sec.Message();
    }

    public String Message()
    {
        Third three = new Third();
        return three.Message();
    }
}
