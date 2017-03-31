package ADPGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class UserCheck
{
    private String Uname = "Riyaad";

    public boolean Validate(String uname1)
    {
        if(!uname1.equals(Uname))
        {
            System.out.println("Invalid user name!!!");
        }
        else{
            System.out.println("Welcome to FB"+ uname1);
        }

        return uname1.equals(Uname);

    }


}
