package SRPGood;

/**
 * Created by Riyaad on 3/29/2017.
 */
public class Game
{
private String Name;
private String Genre;

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getGenre()
    {
        return Genre;
    }

    public void setGenre(String genre)
    {
        Genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Name='" + Name + '\'' +
                ", Genre='" + Genre + '\'' +
                '}';
    }
}
