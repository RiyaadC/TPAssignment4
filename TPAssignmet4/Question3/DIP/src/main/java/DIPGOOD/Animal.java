package DIPGOOD;

/**
 * Created by Riyaad on 3/28/2017.
 */
public class Animal implements Sound
{

    public Animal()
    {

    }

    @Override
    public String CatSound()
    {
        String sound= "Meow";
        return sound;
    }

    @Override
    public String DogSound()
    {
        String sound= "Woof";
        return sound;
    }

}
