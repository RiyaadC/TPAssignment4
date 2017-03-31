package AppConfiguration;

import ISPBad.SamsungPhone;
import ISPGood.ApplePhone;
import ISPGood.SonyPhone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Riyaad on 3/29/2017.
 */
@Configuration
public class AppConf
{
    @Bean(name="Samsung")
    public SamsungPhone getCellphone()
    {
        return new SamsungPhone();
    }

    @Bean(name="Sony")
    public SonyPhone getSony()
    {
        return new SonyPhone();
    }

    @Bean(name="Apple")
    public ApplePhone getApple()
    {
        return new ApplePhone();
    }

}
