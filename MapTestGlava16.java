package HeadFirstJava;

/**
 * Created by Алина on 04.09.2016.
 */
import java.util.*;
public class MapTestGlava16
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Vova", 29);
        scores.put("Anton", 29);
        scores.put("Alina", 25);
        scores.put("MArina", 30);

        System.out.println(scores);
        System.out.println(scores.get("Vova"));
    }

}
