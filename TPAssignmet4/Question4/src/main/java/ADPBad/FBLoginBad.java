package ADPBad;

import ADPGood.FBLogin;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class FBLoginBad
{
    FBLogin login = new FBLogin();

    public boolean Validate(String user)
    {
        if(!user.equals(login.RetrieveUsername()))
        {
            System.out.println("Invalid user name!!!");
        }
        else{
            System.out.println("Welcome "+ user);
        }

        return user.equals(login.RetrieveUsername());

    }

}
