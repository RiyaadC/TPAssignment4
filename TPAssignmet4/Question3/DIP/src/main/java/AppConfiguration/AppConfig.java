package AppConfiguration;

import DIPBAD.Sounds;
import DIPGOOD.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Riyaad on 3/28/2017.
 */
@Configuration
public class AppConfig
{
        @Bean(name = "Bad")
        public Sounds getGreeting()
        {
            return new Sounds();
        }

        @Bean(name="Good")
        public Animal getGreet()
        {
            return new Animal();
        }

}
