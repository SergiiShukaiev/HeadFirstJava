package HeadFirstJava;

/**
 * Created by Алина on 29.08.2016.
 */
import java.io.*;
public class DongeonGame implements Serializable
{
    public int x=3;
    transient long y=4;
    private short z=5;

    int getX(){
        return x;
    }

    long getY(){
        return y;
    }

    short getZ(){
        return z;
    }
}

 class DongeonTest {
     public static void main(String[] args){
         DongeonGame d=new DongeonGame();
         System.out.println(d.getX()+d.getY()+d.getZ());

         try{
             FileOutputStream fos=new FileOutputStream("dg.ser");
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             oos.writeObject(d);
         } catch (Exception e) {e.printStackTrace();}

         try{
             FileInputStream fis=new FileInputStream("dg.ser");
             ObjectInputStream ois=new ObjectInputStream(fis);
             d=(DongeonGame) ois.readObject();

         } catch(Exception e){e.printStackTrace();}
         System.out.println(d.getX()+d.getY()+d.getZ());
     }
}
