package HeadFirstJava;

/**
 * Created by CyberNiggaXX87 on 25.02.2016.
 */
public class MultiForTestDrive
{
    public static void main(String[] args){
        for(int x=0; x<4; x++)
        {

            for (int y = 4; y > 2; y--)
            {

                System.out.println(x + " " + y);

            }
            if (x == 1)
            {
                x++;
            }
        }
    }
}
