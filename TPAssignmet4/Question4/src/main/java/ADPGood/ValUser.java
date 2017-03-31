package ADPGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class ValUser
{
    public boolean isValid()
    {

        FBLogin login = new FBLogin();
        UserCheck user = new UserCheck();

        return user.Validate(login.RetrieveUsername());
    }
}
