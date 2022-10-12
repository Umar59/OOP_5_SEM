import java.util.ArrayList;
import java.util.List;

public class Main 
{
    private static final List<String> songNames =  new ArrayList<>() 
    { 
        {
            add("song 1");
            add("song 2");
            add("song 3");
            add("song 4");
            add("song 5");
        }
    };
    
    private static final List<Integer> songCopiesSold = new ArrayList<>()
    {
        {
            add(10);
            add(20);
            add(30);
            add(40);
            add(50);
        }
    };
    
    public static void main(String[] args) 
    {
        var parsable = LoadRandomInitialValues();
        InfoWriter.WriteClassInfo(parsable);
    }
    
    private static IToStringParsable LoadRandomInitialValues()
    {
        int a = (int) Math.floor(Math.random()*(songNames.size() + 1));
        int b = (int) Math.floor(Math.random()*(songCopiesSold.size() + 1));
        
        return new MusicData(songNames.get(a), songCopiesSold.get(b), true);
    }
}