import ADPBad.FBLoginBad;
import ADPGood.UserCheck;
import ADPGood.ValUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Riyaad on 3/30/2017.
 */
public class TestQuestion4
{
    @Test
    public void testGoodADP() throws Exception {

        ValUser validate = new ValUser();

        UserCheck user = new UserCheck();

        assertTrue(validate.isValid());



    }

    @Test
    public void testBadADP() throws Exception {

        FBLoginBad badlog = new FBLoginBad();

        Assert.assertNotSame(badlog.Validate("Riyaad"),"Riyaad");

    }
}
