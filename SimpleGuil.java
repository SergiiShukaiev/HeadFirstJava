package HeadFirstJava;
import javax.swing.*;
/**
 * Created by Алина on 10.08.2016.
 */
public class SimpleGuil
{
    public static void main(String[] args){
        JFrame frame=new JFrame();
        JButton button=new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300,200);
        frame.setVisible(true);
       // button.changeIt("I've been clicked!");


    }
}
