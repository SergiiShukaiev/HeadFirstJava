package HeadFirstJava;

/**
 * Created by CyberNiggaXX87 on 01.02.2016.
 */
public class izuchaemjavaDog
{
    izuchaemjavaDog d = new izuchaemjavaDog();
    int size;
    String name;
    String breed;

    void bark()
    {
        System.out.println("Гав-гав!");
    }
}
   class izuchaemjavaDogTestDrive
    {
        public static void main(String[] args)
        {
            izuchaemjavaDog d = new izuchaemjavaDog();
            d.size = 40;
            d.bark();
        }
    }

