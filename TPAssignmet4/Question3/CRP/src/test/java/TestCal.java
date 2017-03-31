import CRPGood.Calculator;
import CRPGood.CalculatorInterface;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Riyaad on 3/30/2017.
 */
public class TestCal
{
    @Test
    public void add()
    {
        CalculatorInterface calc = new Calculator();

        int result = calc.add(10,20);
        Assert.assertEquals(result,30);
    }


}
