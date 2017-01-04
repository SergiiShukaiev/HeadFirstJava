package HeadFirstJava;

/**
 * Created by CyberNiggaXX87 on 23.02.2016.
 */
public class Puzzle4
{
    int ivar;

    public static void main(String[] args)
    {
        Puzzle4[] obs = new Puzzle4[6];
        int y = 1;
        int x = 0;
        int result = 0;

        while (x < 6)
        {
            obs[x] = new Puzzle4();
            obs[x].ivar = y;
            y = y * 10;
            x += 1;
        }
        x = 6;
        while (x > 0)
        {
            x -= 1;
            result += obs[x].doStaff(x);
        }
        System.out.println("Результат " + result);
    }


    public int doStaff(int factor)
    {
        if (ivar > 100)
        {
            return ivar * factor;
        } else
        {
            return ivar * (5 - factor);
        }
    }
}