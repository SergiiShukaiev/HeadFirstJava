package HeadFirstJava;

/**
 * Created by Алина on 08.08.2016.
 */
class MyEx extends Exception{}
public class ExTestDrive
{
    public static void doRisky(String t) throws MyEx{
        System.out.println("h");
        if ("yes".equals(t)){
        throw new MyEx(); }
        System.out.print("r");
    }

    public static void main(String[] args){
        String test=args[0];

        try {
            System.out.print("t");
            doRisky(test);
            System.out.print("0");
        } catch (MyEx e) {

            System.out.print("a");
        } finally {
            System.out.print("w");
            System.out.print("s");
        }
    }
}
