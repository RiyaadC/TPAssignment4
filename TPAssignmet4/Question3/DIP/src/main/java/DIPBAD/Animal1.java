package DIPBAD;

import AppConfiguration.AppConf;
import DIPGOOD.Sound;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Riyaad on 3/28/2017.
 */
public class Animal1
{

private ApplicationContext con = new AnnotationConfigApplicationContext(AppConf.class);
private Sound S = (Sound) con.getBean("good");

    public String CatSound()
    {
        return S.CatSound();
    }

    public String DogSound()
    {
        return S.DogSound();
    }

}
